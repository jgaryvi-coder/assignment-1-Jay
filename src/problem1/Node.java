package problem1;


class Node {
    private String data;
    private Node next;

    // Constructor to initialize the node with data
    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() { return data; }
    public Node getNext() { return next; }
    public void setNext(Node n) { next = n; }
}