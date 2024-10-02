import java.util.*;
import java.lang.*;

public class sumofnnumberinarray {
    static int sumArray(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int result = sumArray(arr);
        System.out.println("sum of array elements: " +result);
    }

}
