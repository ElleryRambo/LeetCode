public class _876_链表的中间结点 {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    //独立完成
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur != null){
            n++;
            cur = cur.next;
        }
        n /= 2;
        cur = head;
        while(n > 0){
            cur = cur.next;
            n--;
        }
        return cur;
    }
}
