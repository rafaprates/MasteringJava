public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            double hours = minutes / 60.0;
            double days = hours / 24.0;
            int totalYears = (int) (days / 365.0);
            int remainingDays = (int) (days % 365.0);
            System.out.println(minutes + " min = " + totalYears + " y and " + remainingDays + " d");
        }
    }
}
