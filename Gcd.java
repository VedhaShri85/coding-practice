class Gcd {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 28;

        System.out.println(gcd(a, b));
    }
}
