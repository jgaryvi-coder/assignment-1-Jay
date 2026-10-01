package problem1;

// Adapted from the class slides to use String instead of int[cite: 3]
class Node {
    private String data;    // Changed from int to String
    private Node next;      // Pointer to the next node

    // Constructor to initialize the node with data
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() { return data; }
    public Node getNext() { return next; }
    public void setNext(Node n) { next = n; }
}