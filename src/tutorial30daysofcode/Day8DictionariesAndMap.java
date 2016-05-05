package tutorial30daysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class Day8DictionariesAndMap {
    public static void main(String []argh){
        HashMap<String, String> myMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            // Write code here
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            System.out.println(myMap.get(s) != null ? s + "=" + myMap.get(s) : "Not found");
        }
        in.close();
    }
}
