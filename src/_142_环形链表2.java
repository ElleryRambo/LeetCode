public class _142_环形链表2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast){
            if (fast.next == null || fast.next.next == null)return  null;
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        //快慢指针再次相遇时一定是在入环结点处，这是个结论
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
