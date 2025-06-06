import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num, reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
