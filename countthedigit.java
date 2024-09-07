import java.lang.*;
import java.util.*;
public class countthedigit {
    public static void main(String args[])
    {
    System.out.println("Provide number of Test cases");
    Scanner scn = new Scanner(System.in);
    int T = scn.nextInt();
    for(int i=1;i<=T;i++) {
        Scanner nscn = new Scanner(System.in);
            int R = nscn.nextInt();

            if(R>0)
            {
                int count =0;
                for(int j=R;j>=1;j/=10)
                {
                    R = R%10;
                    count = count +1;
                }
                System.out.println(count);
            }


    }

    }
}
