import java.lang.*;
import java.util.*;

public class functionmore {
    // non-static functions and how we can call the non-static functions.
    void fun(int n)
    {
        int s = 0;
        for (int i=1;i<=n;i++)
        {
            s = s+i;
        }
        System.out.println(s);
    }
    public static void main(String args[])
    {
        functionmore obj = new functionmore();
        obj.fun(5);
//      System.out.println(t);

    }
}
