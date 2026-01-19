class LastDigit {
    static int getLastDigit(String a, String b) {

        // If b == "0", a^0 = 1
        if (b.equals("0")) {
            return 1;
        }

        // Last digit of base a
        int lastDigit = a.charAt(a.length() - 1) - '0';

        // Find b % 4 (since cycle length is 4)
        int mod = 0;
        for (int i = 0; i < b.length(); i++) {
            mod = (mod * 10 + (b.charAt(i) - '0')) % 4;
        }

        // If mod is 0, treat it as 4
        if (mod == 0) {
            mod = 4;
        }

        int result = 1;
        for (int i = 0; i < mod; i++) {
            result = (result * lastDigit) % 10;
        }

        return result;
    }
}
