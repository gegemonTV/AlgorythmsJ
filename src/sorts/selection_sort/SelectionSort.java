package sorts.selection_sort;

import data_structures.linked_list.LinkedList;

public class SelectionSort {

    public static LinkedList<Integer> selectionSort(LinkedList<Integer> list) {
        LinkedList<Integer> arr = new LinkedList<>();
        int startSize = list.length;
        for (int i = 0; i < startSize; i++) {
            int smallestIndex = findSmallestIndex(list);
            arr.add(list.pop(smallestIndex));
        }
        return arr;
    }

    private static int findSmallestIndex(LinkedList<Integer> list) {
        Integer smallest = list.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list.get(i).compareTo(smallest) < 0) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
