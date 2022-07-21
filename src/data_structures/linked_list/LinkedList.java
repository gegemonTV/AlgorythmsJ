package data_structures.linked_list;

public class LinkedList<T> {

    Node<T> root = null;

    public LinkedList(){
        root = new Node<>();
    }

    public void add(T element){
        if (root.current == null)
            root.current = element;
        else {
            Node<T> nextNode = root.next;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = new Node<>(element);
        }
    }

    class Node<E> {
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
    }
}
