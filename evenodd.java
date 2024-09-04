import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    if(N%2==0)
    {
      System.out.println("Your Number is an even number");
    }
    else
    System.out.println("Your number is an Odd Number ");
  }
}