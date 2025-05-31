import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  factorial number ");
        int a = sc.nextInt();
        int c=1;
        for (int i=1;i<=a;i++)
        {
            c=c*i;
        }
        System.out.println("the factorial of "+ a+"!"+"number is "+c);




    }
}
