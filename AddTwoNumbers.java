class ListNodee {
    int val;
    ListNodee next;
    ListNodee(int val) { this.val = val; }
}

public class AddTwoNumbers {

    public static ListNodee addTwoNumbers(ListNodee l1, ListNodee l2) {
        ListNodee dummy = new ListNodee(0); // Dummy node to simplify code
        ListNodee curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNodee(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            curr.next = new ListNodee(carry);
        }

        return dummy.next;
    }

    public static void printList(ListNodee head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNodee l1 = new ListNodee(2);
        l1.next = new ListNodee(4);
        l1.next.next = new ListNodee(3);

        ListNodee l2 = new ListNodee(5);
        l2.next = new ListNodee(6);
        l2.next.next = new ListNodee(4);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        ListNodee result = addTwoNumbers(l1, l2);

        System.out.print("Sum List: ");
        printList(result);
    }
}
