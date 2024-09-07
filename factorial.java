import java.lang.*;
import java.util.*;

public class factorial {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        int sum = 1;
        for(int i=no;i>=1;i--)
        {

            sum = sum*i;
        }
        System.out.println(sum);
    }

}
