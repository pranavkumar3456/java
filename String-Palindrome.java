import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    String N = scn.nextLine();
    
    // System.out.println(N.length());
    // System.out.println(N.charAt(5));
    int T = (N.length());

    String J = "";
    // System.out.println(T-1);
    for(int i=(T-1); i>=0; i--)
    {
      char L = N.charAt(i);
      J += String.valueOf(L);
      
    }
    if(N.equals(J))
    {
      System.out.println("String is palandrome");
    }
    else
    System.out.println("String is not a palandrome");
    
  }
}