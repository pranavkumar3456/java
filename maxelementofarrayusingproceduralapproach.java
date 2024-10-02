import java.lang.*;

public class maxelementofarrayusingproceduralapproach {
   static int elementarry(int arr[])
   {
       int n = arr.length;
       int max = 0;
       for(int i=0;i<n;i++)
       {
           if(max < arr[i])
           {
               max = arr[i];
           }
           else
           {
               continue;
           }
       }
       return max;
   }

   public static void main(String args[])
   {
       int arr[] = { 5,2,4,6,1,4,7,3,9,2};
       int data = elementarry(arr);
       System.out.println("Maximum among element of array is" + " "+data);
   }
}
