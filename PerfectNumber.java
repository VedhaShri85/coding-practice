class PerfectNumber {
    static boolean isPerfectNumber(long n) {
        // 1 is not a perfect number
        if (n <= 1) {
            return false;
        }

        long sum = 1; // 1 is always a factor

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                // Add the pair factor if it's different
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
