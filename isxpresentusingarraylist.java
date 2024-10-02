//Return 1 if the element exists, else return 0.
import java.lang.*;
import java.util.*;
import static java.lang.Integer.*;

public class isxpresentusingarraylist {

    public int solve(ArrayList<Integer> A, int B)
    {
      int n = A.size();
      int sum = 0;
      for (int i =0;i<n;i++)
      {
          if(A.get(i)==B)
          {
              sum = sum +1;
          }
      }
      if(sum>0)
      {
          return 1;
      }
      else
      {
          return 0;
      }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String inputline = scn.nextLine();
        String[] elements = inputline.split(",");
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<elements.length;i++)
        {
            A.add(parseInt(elements[i].trim()));
        }
        int B = scn.nextInt();
        isxpresentusingarraylist sol = new isxpresentusingarraylist();
        int data = sol.solve(A,B);
        System.out.println(data);
    }
}
