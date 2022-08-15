public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) { System.out.println("Invalid Value"); }

        String factors = "";
        for (int i=1; i<=number; i++) {
            if (number % i == 0) {
                factors = factors + " " + String.valueOf(i);
            }
        }
        System.out.println(factors);
    }

}
