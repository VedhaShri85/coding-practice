public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i % 2 == 0) {
                sum -= 1;
            } else {
                sum += 2;
            }
        }

        System.out.println(sum);
    }
}
