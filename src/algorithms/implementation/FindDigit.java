package algorithms.implementation;


public class FindDigit {

    public void findDigit(int n) {
        String N = "" + n;
        int arr[] = new int[N.length()];
        int count = 0;

        int i = 0;
        int nn = n;
        while (nn != 0) {
            arr[i] = nn % 10;
            nn /= 10;
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0){

            }else if (n % arr[j] == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
