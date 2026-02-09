import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            int temp = n;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = n;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
    }
}
