public class _160_相交链表 {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int data) {
            this.val = data;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int n = 0;
        while(cur1 != null){
            n++;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            n--;
            cur2 = cur2.next;
        }
        if(cur2 != cur1)return null;
        cur1 = n > 0 ? headA : headB;
        cur2 = cur1 == headA ? headB : headA;
        n = Math.abs(n);
        while(n > 0){
            n--;
            cur1 = cur1.next;
        }
        while(cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur2;
    }
}
