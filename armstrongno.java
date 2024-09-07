import java.lang.*;
import java.util.*;

public class armstrongno {
    public static void main(String args[])
    {
        System.out.println("provide the number to check armstrong!!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = n;
        int sum = 0;
        while(n>0)
        {
            int j = n%10;
            sum = sum + j*j*j;
            n/=10;

        }

        if(t==sum)
        {
            System.out.println("no is armstrong!!");
        }
        else
        {
            System.out.println("no is not a armstrong!!");
        }
    }

}
