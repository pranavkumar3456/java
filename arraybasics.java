import java.lang.*;
import java.util.*;

public class arraybasics {
    public static void main(String args[])
    {
        //Array: Fixed number of values of same data type::
        //Array Syntax: datatype name[] = new datatype[size];
        // e.g. --> int arr[]  = new int[4]
        // e.g. --> float arr[] = new float[5]
        // various ways:: -->
        // datatype []name = new datatype[size] e.g., int []arr  = new int[4]
        //or
        // datatype[] name = new datatype[size] eg int[] arr = new int[4]

        int arr[] = new int[4];
        int n = arr.length;
        System.out.println(n);
    }
}
