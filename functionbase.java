import java.lang.*;
import java.util.*;

public class functionbase {
    static int addition(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    static int squareno(int c)

    {
        return c*c;
    }

    public static void main(String args[])
    {
       System.out.println("Hello!! Welcome");
//        int t =  addition(5,10);
//       System.out.println(t);
//       System.out.println("Bye");
        System.out.println("Provide 2 numbers for addition!!!");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(addition(a,b));
        System.out.println("BYe");

        System.out.println("Provide the number for doing square");
        Scanner scn1 = new Scanner(System.in);
        int c = scn.nextInt();
        System.out.println(squareno(c));

    }
}
