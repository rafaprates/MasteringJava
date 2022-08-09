public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        if (number < 0) {number = number * -1;}

        int copyOfNumber = number;
        int lastDigit = 0;
        int reverseNumber = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverseNumber +=  lastDigit;
            reverseNumber *= 10;
            number /= 10;
        }

        reverseNumber /= 10;
        return copyOfNumber == reverseNumber;
    }
}
