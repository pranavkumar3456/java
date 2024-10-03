import java.util.*;
import java.lang.*;

public class matrixuserinput {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("No of rows you want");
        int n = scn.nextInt();
        System.out.println("No of column you want");
        int m = scn.nextInt();

        int mat[][] = new int[n][m];


        for(int i = 0;i<=n-1;i++)
        {
            for(int j =0;j<=m-1;j++)
            {
                mat[i][j] = scn.nextInt();
            }
        }

        //System.out.println(mat[0][2]);
        //System.out.println(mat[3][4]);

        for(int i =0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
