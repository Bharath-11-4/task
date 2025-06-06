import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original = input.nextInt();
        int reversed = 0;
        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        System.out.println(reversed);
    }
}
