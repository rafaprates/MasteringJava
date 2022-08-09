public class NumberInWord {
    public static void printNumberInWord(int n) {
        String numberToPrint;
        switch (n) {
            case 0:
                numberToPrint = "ZERO";
                break;
            case 1:
                numberToPrint = "ONE";
                break;
            case 2:
                numberToPrint = "TWO";
                break;
            case 3:
                numberToPrint = "THREE";
                break;
            case 4:
                numberToPrint = "FOUR";
                break;
            case 5:
                numberToPrint = "FIVE";
                break;
            case 6:
                numberToPrint = "SIX";
                break;
            case 7:
                numberToPrint = "SEVEN";
                break;
            case 8:
                numberToPrint = "EIGHT";
                break;
            case 9:
                numberToPrint = "NINE";
                break;
            default:
                numberToPrint = "OTHER";
                break;
        }
        System.out.println(numberToPrint);
    }
}
