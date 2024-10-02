import java.lang.*;
import java.util.*;

public class sumofnumber {
    public static void main(String args[])
    {
        System.out.println("Provide number till you required sum::");
        Scanner scn= new Scanner(System.in);
        int N = scn.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++)
        {
            sum= sum+i;
        }
        System.out.println(sum);

    }
}
