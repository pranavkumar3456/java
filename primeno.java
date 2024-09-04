import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String args[])
  {
            Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();
            int count = 0;
            for(int i=1;i<=N;i++)
            {            
            if(N%i==0)
              {
                count = count+1;
              }
            }            
            if(count==2)
              System.out.println("Number is a prime number");
            else
            System.out.println("Number is not a prime number");

}
}