import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (n > 0) {
            int digit = n % 10;

            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }

            n /= 10;
        }

        System.out.println(min2);  
    }
}
