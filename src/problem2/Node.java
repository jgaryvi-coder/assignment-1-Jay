package problem2;

class Node {
    private String data;
    private Node prev;
    private Node next;

    public Node(String data, Node p, Node n) {
        this.data = data;
        this.prev = p;
        this.next = n;
    }

    public String getData() { return data; }
    public Node getPrev() { return prev; }
    public Node getNext() { return next; }
    public void setPrev(Node prev) { this.prev = prev;}
    public void setNext(Node next) { this.next = next;}
}