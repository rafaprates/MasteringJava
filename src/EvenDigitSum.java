public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < 0) { return -1; }

        int rest;
        int lastDigit;
        int sum = 0;
        while (number > 10) {
            rest = number % 10;
            if (rest % 2 == 0) {
                sum += rest;
            }
            number /= 10;
        }

        lastDigit = number;

        if (lastDigit % 2 == 0) {
            return sum + lastDigit;
        } else {
            return sum;
        }
    }
}
