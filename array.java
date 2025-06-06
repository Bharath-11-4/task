import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the   number ");
        int n= sc.nextInt();
        //System.out.println("enter the array  number ");
        //int c=0;
        int[] a={1,2,3,4,5,6};
        for(int i=0;i<=a.length;i++)
        {
            //a[i] = sc.nextInt();
            //c=c+a[i];
            //System.out.println("roll no is "+ c);
            if (n==a[i])
            {
                System.out.println("present");
                 
            
                
            }
    
            
        }
        System.out.println("not prrent");
       
        //System.out.println("roll no is "+ c);
       
    }
    
}
