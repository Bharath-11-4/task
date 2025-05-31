import java.util.Arrays;
import java.util.Scanner;


public class max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
      
        int arr[] =new int[n];
        //int max =6;

        for(int i=0;i<=arr.length;i++)
        {
         if(min>arr[i])
         {
            min=arr[i];
         }
         if(max<arr[i])
         {
            max=arr[i];
         }
         System.out.println(max);
         System.out.println(min);
         //min=arr[i];

        }




        }
        //System.err.println(max(a));
       
    
       
    }
    
}
