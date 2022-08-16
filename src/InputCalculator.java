import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int readNumber;
        int sum = 0;
        long average = 0;
        int quantityReads = 0;
        while (scanner.hasNextInt()) {
            readNumber = scanner.nextInt();
            quantityReads++;
            sum += readNumber;
        }
        scanner.close();

        average = Math.round(((double) sum / (double) quantityReads));
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
