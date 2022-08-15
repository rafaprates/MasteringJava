public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigitNumber1 = number1 % 10;
        int lastDigitNumber2 = number2 % 10;
        int lastDigitNumber3 = number3 % 10;
        return lastDigitNumber1 == lastDigitNumber2 ||
                lastDigitNumber1 == lastDigitNumber3 ||
                lastDigitNumber2 == lastDigitNumber3;
    }

    public static boolean isValid(int number) {

        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
