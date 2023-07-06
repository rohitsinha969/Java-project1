public class LinkedLists_in_Java__Page2 {

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

    public static class LinkedList {
        Node head;
        Node tail;

        LinkedList() {
            this.head = null;
            this.tail = null;
        }

        /*
         * // Insert at Head - Before the Head
         * public void insertAtHead(int data) {
         * // steps involved :
         * // 1 - create a NewNode whenever needed
         * // 2 - point the next of NewNode to Head
         * // 3 - update the Head to NewNode so next time more Nodes gets attached to
         * Head
         * // ...
         * 
         * // step 1
         * Node newNode = new Node(data);
         * // step 2
         * newNode.next = head;
         * // step 3
         * head = newNode;
         * if (tail == null) {
         * tail = newNode;
         * }
         * }
         */

        // Insert at Tail - Behind the Tail
        public void insertAtTail(int data) {
            // steps involved :
            // 1 - create a NewNode whenever needed
            // 2 - point the next of Head to NewNode
            // 3 - update the Null after NewNode so next time more Nodes gets attached after
            // NewNode when needed ...
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Insert at Position - At any Specified Index
        public void insertAtAnyPosition(int data, int position) {
            // steps involved :
            // 1 - create a NewNode whenever needed between two Nodes
            // 2 - look for the position where you want to insert that data say Prev and
            // Curr
            // 3 - now finally join the newNode next to curr and prev next to newNode ...
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            int i = 1;
            Node prev = head;
            Node curr = head;
            while (i < position) {
                prev = prev.next;
                i++;
            }
            curr = prev.next;

            newNode.next = curr;
            prev.next = newNode;
        }

        /*
         * // Delete at any Position - Head/Tail/Any Posy
         * public void deleteAtAnyPosition(int position, int data) {
         * // try completing this on your own bro
         * }
         */

        // Printing Linked List
        public void printLinkedList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.insertAtTail(5);

        // Printing the Linked List :
        System.out.println("Linked List is : ");
        ll.printLinkedList();
    }
}
