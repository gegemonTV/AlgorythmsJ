package data_structures;

import data_structures.linked_list.LinkedList;

public class DSUsage {
    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(2, 4);
        System.out.println(ints);
    }
}
