import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        boolean prime = true;
        if (value <= 1)
            prime = false;
        else {
            for (int i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
