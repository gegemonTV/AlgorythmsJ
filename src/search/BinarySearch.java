package search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int element) {
        Arrays.sort(array);     // TODO: make own quicksort method
        int index = array.length / 2;
        int current = array[index];
        int min = 0, max = array.length - 1;
        while (min != max) {
            if (current == element) {
                return index;
            }
            if (current < element) {
                min = index;
            }
            if (current > element) {
                max = index;
            }
            index = (max + min) / 2;
            current = array[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int x = 3;
        System.out.println(binarySearch(a, x));
    }
}
