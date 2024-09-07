import java.lang.*;
import java.util.*;

public class perfectsquare {
    public static void main(String args[])
    {
        Scanner scn  = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i*i<=a)
            {
                System.out.println(i*i);
            }
        }

    }
}
