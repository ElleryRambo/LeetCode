public class _86_分割链表 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode partition(ListNode head, int x) {
        ListNode sH = null;
        ListNode sT = null;
        ListNode bH = null;
        ListNode bT = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = null;
            if(head.val < x){
                if(sH == null){
                    sH = head;
                    sT = head;
                }else{
                    sT.next = head;
                    sT = sT.next;
                }
            }else{
                if(bH == null){
                    bH = head;
                    bT = head;
                }else{
                    bT.next = head;
                    bT = bT.next;
                }
            }
            head = next;
        }
        if(sT != null){
            sT.next = bH;
        }
        return sH != null ? sH : bH;
    }

}
