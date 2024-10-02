import java.lang.*;
import java.util.*;
public class reversenumber {
    public static void main(String[] args)
    {
        System.out.println("Provide the number");
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        while(N!=0)
        {
            System.out.print(N%10);
            N=N/10;
        }

    }
}
