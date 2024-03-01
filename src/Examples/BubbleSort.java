package Examples;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 1, 7, 4, 2};
        int[] sortedArray = bubbleSort(unsortedArray);
        printArray(unsortedArray);
        System.out.print(" => ");
        printArray(sortedArray);
    }

    private static int[] bubbleSort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length - 1 - i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j + 1];
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        int maxIndex = array.length - 1;
        for (int i = 0; i < maxIndex; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print(array[maxIndex]);
        System.out.print("]");
    }

}
