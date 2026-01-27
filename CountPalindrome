import java.util.Scanner;

public class CountPalindrome {
    static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
