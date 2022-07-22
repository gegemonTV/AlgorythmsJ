package sorts;

import data_structures.linked_list.LinkedList;
import sorts.quick_sort.QuickSort;
import sorts.selection_sort.SelectionSort;

public class SortUsage {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(-5);
        arr.add(7);
        arr.add(-3);
        System.out.println(QuickSort.quickSort(arr));
    }
}
