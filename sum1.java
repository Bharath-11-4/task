import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();

        int c=0;
        for(int i=1; i<=a;i++)
        {
            c=c+i;
        }
        System.out.println("the sum of "+a+"natural number  "+ c);
    }
}
