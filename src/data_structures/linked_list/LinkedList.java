package data_structures.linked_list;

public class LinkedList<T> {

    Node<T> root;
    public int length = 0;

    public LinkedList() {
        root = new Node<>();
    }

    public void add(T element) {
        if (root.current == null) {
            root.current = element;
            root.next = new Node<>();
        } else {
            Node<T> nextNode = root.next;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.current = element;
            nextNode.next = new Node<>();
        }
        length++;
    }

    public void add(int index, T element) {
        if (index > length - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " out of range");
        Node<T> nextNode = root;
        for (int i = 0; i < index; i++){
            nextNode = nextNode.next;
        }
        Node<T> tempNode = nextNode.copy();
        nextNode.current = element;
        nextNode.next = tempNode;
        length++;
    }

    public T get(int index) {
        if (index > length - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " out of range");
        Node<T> nextNode = root;
        for (int i = 0; i < index; i++){
            nextNode = nextNode.next;
        }
        return nextNode.current;
    }

    public T pop(int index) {
        if (index > length - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " out of range");
        Node<T> nextNode = root;
        for (int i = 0; i < index; i++){
            nextNode = nextNode.next;
        }
        T res = nextNode.current;
        nextNode.current = nextNode.next.current;
        if (nextNode.next.next != null)
            nextNode.next = nextNode.next.next.copy();
        else
            nextNode.next = null;
        length--;
        return res;
    }

    public T pop() {
        return this.pop(length-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(root.current)
                .append(" ");
        if (root.next != null) {
            Node<T> node = root.next;
            while (node.next != null) {
                sb.append(node.current)
                        .append(" ");
                node = node.next;
            }
        }
        return sb.toString();
    }

    static class Node<E> {
        Node<E> next = null;
        E current = null;

        public Node(Node<E> next, E current) {
            this.next = next;
            this.current = current;
        }

        public Node(E current) {
            this.current = current;
        }

        public Node() {

        }

        public Node<E> copy() {
            Node<E> copy = new Node<>(current);
            Node<E> next = this.next;
            while (next != null) {
                copy.next = new Node<>(next.current);
                next = next.next;
            }
            return copy;
        }
    }
}
