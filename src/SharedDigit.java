public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99 ) {
            return false;
        }

        int number1Digit = number1 % 10;
        int number2Digit = number2 % 10;
        int number1tens = number1 /= 10;
        int number2tens = number2 /= 10;

        return number1Digit == number2Digit || number1Digit == number2tens
                || number1tens == number2Digit || number1tens == number2tens;
    }
}
