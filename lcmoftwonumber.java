import java.lang.*;
import java.util.*;

public class lcmoftwonumber {
    public static void main(String args[])
    {
        Scanner scn  = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a<1 || b >200)
        {
            System.out.println("choose number between following i.e., 1 <= A,B <= 200");
        }
        else
        {
            for(int i=2;i<=a*b;i++)
            {
                if(i%a==0 && i%b==0)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
