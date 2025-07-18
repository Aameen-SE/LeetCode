import java.util.List;

class ListNode{

    int value;
    ListNode next;

    public ListNode(int value ){
        this.value=value;
    }
}

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next= new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next=new ListNode(2);
        l2.next.next= new ListNode(3);

       ListNode merge = mergedSortList(l1,l2);
       printList(merge);
    }

    public static void printList(ListNode head){

        while(head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static ListNode mergedSortList(ListNode l1,ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(l1!=null&&l2!=null){
            if(l1.value<l2.value){
                current.next=l1;
                l1=l1.next;
            }else {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

}
