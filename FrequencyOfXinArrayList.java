import java.util.ArrayList;
import java.util.*;
import java.lang.*;

import static java.lang.Integer.parseInt;

public class FrequencyOfXinArrayList {

    public int solve(ArrayList<Integer> A, int B)
    {
        int n = A.size();
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(A.get(i)==B)
            {
                sum = sum +1;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String inputLine = scn.nextLine();
        String[] elements = inputLine.split(",");
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0;i< elements.length;i++)
        {
            A.add(parseInt(elements[i].trim()));
        }
        int B = scn.nextInt();
        FrequencyOfXinArrayList sol = new FrequencyOfXinArrayList();
        int data = sol.solve(A,B);
        System.out.println(data);

        scn.close();

    }

}
