public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remainingKiloBytes;

        megaBytes = kiloBytes / 1024;
        remainingKiloBytes = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(
                    kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB"
            );
        } else {
            System.out.println("Invalid Value");
        }
    }
}
