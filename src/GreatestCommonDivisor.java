public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int i = 1;
        int greastCommonDivisor = 1;
        while (i <= first || i <= second) {
            if (first % i == 0 && second % i == 0) {
                greastCommonDivisor = i;
            }
            i++;
        }
        return greastCommonDivisor;
    }
}
