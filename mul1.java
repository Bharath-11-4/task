import java.util.Scanner;

public class mul1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(a+"x"+i+"= "+(a*i));
        }

    }
    
}
