package Section_8_Arrays_Lists_Autoboxing_Unboxing;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int sizeOfArray) {

        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    private static int findMin(int[] array) {

        int minimumValue = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i];
            }
        }

        return minimumValue;
    }

}
