import java.util.*;
import java.lang.*;

public class fabonnaci {

    public static void main(String args[])
    {
        int first = 0;
        int second = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++) {
            System.out.print(first +" ");
            int next = first + second;
            first = second;
            second = next;

        }
        System.out.println();
    }

}
