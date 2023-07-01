public class LinkedLists_in_Java {
    // creating class for Linked List
    public static class Node {
        int data;
        Node next;

        // creating constructors for Node
        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // function to print Linked List
    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        // creating different nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);

        // connecting different nodes together
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;

        // printing the Linked List by function call
        System.out.println("Linked List is : ");
        printLinkedList(head);
    }
}
