import java.util.Scanner;

class CheckFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int N = sc.nextInt();

        int a = 0, b = 1;

        if (N == 0 || N == 1) {
            System.out.println("Yes");
            return;
        }

        while (b < N) {
            int c = a + b;
            a = b;
            b = c;
        }

        if (b == N)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
