import java.util.*;
import java.lang.*;

public class freqofnuminarray {

    static int frequency(int arr[], int k) {
        int n = arr.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (k == arr[i]) {
                s = s + 1;
            } else {
                continue;
            }
        }
        return s;
    }
        public static void main(String args[]){
            int arr[] = {1, 3, 5, 6, 8, 7, 6, 9, 2, 10};
            System.out.println("Provide the number which you find occurance");
            Scanner scn = new Scanner(System.in);
            int k = scn.nextInt();
            scn.close();

            int result = frequency(arr, k);
            System.out.println("frequency of number" + " " +k+" "+ "in array is " +result);
        }

}
