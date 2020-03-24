public class _234_回文链表 {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int data) {
            this.val = data;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode pre = null;
        ListNode next = null;
        while(fast != null){
            next = fast.next;
            fast.next = pre;
            pre = fast;
            fast = next;
        }
        ListNode n1 = pre;
        ListNode n2 = head;
        while(n1 != null && n2 != null){
            if(n1.val != n2.val){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        while(pre != null){
            n2 = pre.next;
            pre.next = n1;
            n1 = pre;
            pre = n2;
        }
        return true;
    }
}
