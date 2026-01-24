class Salary {
    public static void main(String[] args) {
        double salary = 60000;
        int years = 5;
        double bonusPercent = 0;

        if (years < 1) bonusPercent = 0;
        else if (years <= 3) bonusPercent = 5;
        else if (years <= 6) bonusPercent = 10;
        else bonusPercent = 15;

        if (salary > 50000 && bonusPercent > 0) {
            bonusPercent -= 2;
        }

        double bonus = salary * bonusPercent / 100;
        System.out.println(bonus);
    }
}
