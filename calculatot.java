import java.util.Scanner;
public class calculatot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        char q = input.next().charAt(0);
        if (q == '+')
            System.out.println(x + y);
        else if (q == '-')
            System.out.println(x - y);
        else if (q == '*')
            System.out.println(x * y);
        else if (q == '/')
            System.out.println(x / y);
        else
            System.out.println("Invalid");
    }
}
