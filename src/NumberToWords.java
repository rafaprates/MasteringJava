public class NumberToWords {

    public static void numberToWords(int number) {

        int countDigitsNumber = getDigitCount(number);
        int reversedNumber = reverse(number);
        int countDigitsReversedNumber = getDigitCount(reversedNumber);
        String textNumber = "";
        String textToPrint = "";
        int digit;
        while (reversedNumber > 0) {
            digit = reversedNumber % 10;
            reversedNumber /= 10;
            switch (digit) {
                case 0:
                    textNumber = "Zero";
                    break;
                case 1:
                    textNumber = "One";
                    break;
                case 2:
                    textNumber = "Two";
                    break;
                case 3:
                    textNumber = "Three";
                    break;
                case 4:
                    textNumber = "Four";
                    break;
                case 5:
                    textNumber = "Five";
                    break;
                case 6:
                    textNumber = "Six";
                    break;
                case 7:
                    textNumber = "Seven";
                    break;
                case 8:
                    textNumber = "Eight";
                    break;
                case 9:
                    textNumber = "Nine";
                    break;
            }
            textToPrint = textToPrint + textNumber + " ";
        }

        int factor = 1;
        if (countDigitsNumber > countDigitsReversedNumber) {
            factor = countDigitsNumber - countDigitsReversedNumber;
            for (int i=0; i<factor; i++) {
                textToPrint = textToPrint + "Zero ";
            }
        } else if (number == 0) {
            textToPrint = "Zero";
        } else if (number < 0) {
            textToPrint = "Invalid Value";
        }
        System.out.println(textToPrint.trim());
    }

    public static int reverse(int number) {
        boolean negativeNumberFlag = false;
        if (number < 0) {
            number *= -1;
            negativeNumberFlag = true;
        }

        int reversedDigitCount = 0;
        int reversedNumber = 0;
        int digit;
        while (number >= 1) {
            reversedDigitCount ++;
            digit = number % 10;
            reversedNumber *= 10;
            reversedNumber += digit;
            number /= 10;
        }

        if (negativeNumberFlag)
            return reversedNumber * -1;
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }
        int digit;
        int count = 0;
        while (number >= 1) {
            count++;
            digit = number % 10;
            number /= 10;
        }

        return count;
    }
}
