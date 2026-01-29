import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("INVALID INPUT");
        } else {
            for (int i = 1; i <= n; i++) {

                // print spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                // print stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
