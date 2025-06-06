import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        if (first >= second && first >= third)
            System.out.println(first);
        else if (second >= first && second >= third)
            System.out.println(second);
        else
            System.out.println(third);
    }
}
