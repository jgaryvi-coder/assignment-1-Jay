package problem2;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // (a) Add the values "Dog", "Cow", "Sheep", "Cat" and display forward
        list.add(1, "Dog");
        list.add(2, "Cow");
        list.add(3, "Sheep");
        list.add(4, "Cat");
        System.out.print("Forward: ");
        list.displayForward();

        // (b) Add a node with value "Horse" at position 3 and show backward
        list.add(3, "Horse");
        System.out.print("Backward: ");
        list.displayBackward();

        // (c) Display value at position 3, remove it, show forward
        System.out.println("Value of removed node at position 3: " + list.remove(3));
        System.out.print("Forward after removal: ");
        list.displayForward();
    }
}