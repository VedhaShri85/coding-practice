import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0, b = 1;

      
        if (a <= N) System.out.print(a);

        // Print second number
        if (b <= N) System.out.print(" " + b);

        while (true) {
            int c = a + b;
            if (c > N) break;

            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
