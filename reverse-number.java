import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    while(N!=0)
    {
     System.out.print(N%10);
     N=N/10;
    }
    
  }
}