import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value > 0)
            System.out.println("Positive");
        else if (value < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
