package sorts.quick_sort;

import data_structures.linked_list.LinkedList;

public class QuickSort {
    public static LinkedList<Integer> quickSort(LinkedList<Integer> list) {
        if (list.length < 2) {
            return list;
        }
        Integer base = list.get(0);
        LinkedList<Integer> less = new LinkedList<>(), more = new LinkedList<>();
        for (int i = 1; i < list.length; i++) {
            if (list.get(i) <= base) {
                less.add(list.get(i));
            } else {
                more.add(list.get(i));
            }
        }
        LinkedList<Integer> res = quickSort(less);
        res.add(base);
        res.concat(quickSort(more));
        return res;
    }
}
