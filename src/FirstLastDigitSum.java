public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) { return -1; }
        else if (number < 10) { return number + number; }

        int lastDigit = 0;
        int firstDigit = number % 10;
        while (number >= 10) {
            number = number / 10;
            System.out.println("NUMBER  " + number);
        }
        lastDigit = number;

        return firstDigit + lastDigit;
    }
}