package 链表;

public class _24_两两交换链表中的节点 {
     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
