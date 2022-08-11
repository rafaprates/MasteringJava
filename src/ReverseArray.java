import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {

        int[] reversedArray = Arrays.copyOf(array, array.length);

        int decreasingIndex = array.length;
        for (int i=0; i<array.length; i++) {
            decreasingIndex--;
            reversedArray[decreasingIndex] = array[i];
        }

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
