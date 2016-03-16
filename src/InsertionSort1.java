import java.util.Scanner;


public class InsertionSort1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        String[] firstLine = sc.nextLine().split(" ");
        int[] sortedList = new int[firstLine.length];

        for (int i = 0; i < firstLine.length; i++) {
            sortedList[i] = Integer.parseInt(firstLine[i]);
        }

        InsertionSort1 i = new InsertionSort1();
        i.insertionSort1(sortedList);
    }

    public void insertionSort1(int[] sortedList) {

    }

}
