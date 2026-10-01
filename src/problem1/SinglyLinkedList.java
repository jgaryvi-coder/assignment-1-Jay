package problem1;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() { return head == null; }
    public int size() { return size; }


    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    // Required Assignment Method 1
    public String get(int index) {
        if (index < 1 || index > size) {
            System.out.println("The index is invalid");
            return null;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // Required Assignment Method 2
    public boolean contains(String value) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}