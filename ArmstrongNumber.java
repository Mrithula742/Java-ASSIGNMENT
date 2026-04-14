import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}