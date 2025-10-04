public class PalindromeLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to check if linked list is palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle (slow will be at mid)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare first and second halves
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        boolean isPalindrome = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // (Optional) Restore the list
        reverseList(secondHalf);

        return isPalindrome;
    }

    // Helper: Reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // Helper: Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example 1: Palindrome list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        System.out.println("List 1:");
        printList(head1);
        System.out.println("Is Palindrome? " + isPalindrome(head1));
        System.out.println();

        // Example 2: Not a palindrome
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("List 2:");
        printList(head2);
        System.out.println("Is Palindrome? " + isPalindrome(head2));
        System.out.println();

        // Example 3: Odd length palindrome
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(2);
        head3.next.next.next.next = new ListNode(1);

        System.out.println("List 3:");
        printList(head3);
        System.out.println("Is Palindrome? " + isPalindrome(head3));
    }
}
