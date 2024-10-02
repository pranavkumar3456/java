import java.util.ArrayList;
import java.util.Scanner;

public class arrlistcountoccurance {

    public int solve(ArrayList<Integer> A, int B)
    {
        int n = A.size();
        int sum = 0;

        for(int i =0;i<n;i++)
        {
            if(A.get(i)==B)
            {
                sum = sum+1;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int t = scn.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0;i<t;i++)
        {
            A.add(scn.nextInt());
        }

        System.out.println("Enter the number that is to be counted");
        int B = scn.nextInt();

        arrlistcountoccurance sol = new arrlistcountoccurance();
        int data = sol.solve(A,B);

        System.out.println(data);
        scn.close();
    }
}
