import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String args[])
  {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    
    for (int i=1;i<=N;i++)
    {
      int count = 0;
      for (int j=1;j<=i;j++)
      {
        
        if(i%j==0)
        {
        count = count+1;
        }
        else
        continue;
        
        
      }
      if(count==2)
      System.out.println(i);
      else
      continue;
    }

  }
}