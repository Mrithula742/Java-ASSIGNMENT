import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        int digit;
        while(n!=0){
            digit=n%10;
            n=n/10;
             if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
                return;
            }

            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);
                return;
            }

            rev = rev * 10 + digit;
        }

        System.out.println("Reversed number: " + rev);
    }
}
