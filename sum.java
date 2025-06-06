import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int limit = input.nextInt();
        for (int i = 1; i <= limit; i++)
            total += i;
        System.out.println(total);
    }
}
