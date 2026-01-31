import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] h = new long[n];
        h[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            long next2 = h[i2] * 2;
            long next3 = h[i3] * 3;
            long next5 = h[i5] * 5;

            long next = Math.min(next2, Math.min(next3, next5));
            h[i] = next;

            if (next == next2) i2++;
            if (next == next3) i3++;
            if (next == next5) i5++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(h[i] + " ");
        }
    }
}
