package problem2;


public class DoublyLinkedList {
    private Node header;
    private Node trailer;
    private int size;

    public DoublyLinkedList() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    private void addBetween(String e, Node pred, Node succ) {
        Node newNode = new Node(e, pred, succ);
        pred.setNext(newNode);
        succ.setPrev(newNode);
        size++;
    }

    private String remove(Node rnode) {
        Node pred = rnode.getPrev();
        Node succ = rnode.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
        size--;
        return rnode.getData();
    }

    // Required Method 1: Display forward
    public void displayForward() {
        Node current = header.getNext();
        while (current != trailer) {
            System.out.print(current.getData() + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // Required Method 2: Display backward
    public void displayBackward() {
        System.out.print("null <-> ");
        Node current = trailer.getPrev();
        while (current != header) {
            System.out.print(current.getData());
            if (current.getPrev() != header) {
                System.out.print(" <-> ");
            }
            current = current.getPrev();
        }
        System.out.println();
    }

    // Required Method 3: Add at index using class helper method
    public void add(int index, String value) {
        if (index < 1 || index > size + 1) {
            System.out.println("The index is invalid");
            return;
        }
        Node current = header;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        addBetween(value, current.getPrev(), current);
    }

    // Required Method 4: Remove at index using class helper method
    public String remove(int index) {
        if (index < 1 || index > size) {
            System.out.println("The index is invalid");
            return null;
        }
        Node current = header;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return remove(current);
    }
}