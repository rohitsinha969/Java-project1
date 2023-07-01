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

    public static Node insertAtHead(Node head, int data) {
        // steps involved :
        // 1 - create a NewNode whenever needed
        // 2 - point the next of NewNode to Head
        // 3 - update the Head to NewNode so next time more Nodes gets attached to Head

        // step 1
        Node newNode = new Node(data);
        // step 2
        newNode.next = head;
        // step 3
        // head = newNode;
        return newNode;
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

        /*
         * // very Un-Professional Method of doing this
         * // creating different nodes
         * Node head = new Node(1);
         * Node second = new Node(2);
         * Node third = new Node(3);
         * Node forth = new Node(4);
         * Node fifth = new Node(5);
         * 
         * // connecting different nodes together
         * head.next = second;
         * second.next = third;
         * third.next = forth;
         * forth.next = fifth;
         * fifth.next = null;
         * 
         */

        Node head = new Node(10);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 30);
        head = insertAtHead(head, 40);
        head = insertAtHead(head, 50);
        // printing the Linked List by function call
        System.out.println("Linked List is : ");
        printLinkedList(head);
    }
}
