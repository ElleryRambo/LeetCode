import java.util.List;

public class _141_环形链表 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //判断有无环
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (slow != fast){
            if (fast.next == null || fast.next.next == null)return  false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
