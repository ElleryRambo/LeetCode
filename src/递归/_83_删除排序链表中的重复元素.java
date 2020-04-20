package 递归;

public class _83_删除排序链表中的重复元素 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val)head = head.next;
        return head;
    }
}
