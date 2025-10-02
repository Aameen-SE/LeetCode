class ListNode {
    int val;
    ListNodee next;
    ListNode(int val) { this.val = val; }
}

public class RemoveNthFromEnd {

    public static ListNodee removeNthFromEnd(ListNodee head, int n) {
        ListNodee dummy = new ListNodee(0); // Dummy node to handle edge cases
        dummy.next = head;

        ListNodee first = dummy;
        ListNodee second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove nth node
        second.next = second.next.next;

        return dummy.next;
    }

    public static void printList(ListNodee head) {
        ListNodee temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: List = 1->2->3->4->5, n = 2
        ListNodee head = new ListNodee(1);
        head.next = new ListNodee(2);
        head.next.next = new ListNodee(3);
        head.next.next.next = new ListNodee(4);
        head.next.next.next.next = new ListNodee(5);

        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.print("After Removing 2nd Node from End: ");
        printList(head);
    }
}
