package problem1;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // (a) Add the values
        list.addLast("Dog");
        list.addLast("Cow");
        list.addLast("Sheep");
        list.addLast("Cat");

        // (b) Display whether "Horse" exists
        System.out.println("Contains 'Horse': " + list.contains("Horse"));

        // (c) Display value of the node at position 2
        System.out.println("Value at position 2: " + list.get(2));
    }
}