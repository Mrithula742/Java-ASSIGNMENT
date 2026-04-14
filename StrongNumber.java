import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;

            // factorial of digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }
}