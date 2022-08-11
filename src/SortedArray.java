import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int sizeOfArray) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + sizeOfArray + " integer values:\r");

        int[] intArray = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (array[j] < array[i]) {
                    int temporaryValue = array[i];
                    array[i] = array[j];
                    array[j] = temporaryValue;
                }
            }
        }
        return array;
    }
}
