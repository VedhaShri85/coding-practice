import java.util.*;

public class SubarrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= arr[j];
                if (product == target) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (found)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}
