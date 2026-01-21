class RevExponentiation {
    static int reverseExponentiation(int n) {
        int rev = 0;
        int temp = n;

        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }

        int result = 1;

        for (int i = 0; i < rev; i++) {
            result *= n;
        }

        return result;
    }
}

//geeksforgeeks
