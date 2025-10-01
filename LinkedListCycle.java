
public class LinkedListCycle {

    // Node class for linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to detect cycle in linked list
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move by 1
            fast = fast.next.next;    // move by 2

            if (slow == fast) {       // cycle detected
                return true;
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 0 -> -4
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // Creating a cycle: last node points to second node
        head.next.next.next.next = head.next;

        // Check if linked list has cycle
        boolean result = hasCycle(head);
        System.out.println("Linked List has cycle? " + result);
    }
}
