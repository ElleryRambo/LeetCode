package 链表;

public class _面试题18_删除链表的节点 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null)return null;
        if(head.val == val)return head.next;
        ListNode cur = head.next;
        ListNode cur2 = head;
        while(cur != null){
            if(cur.val == val){
                cur2.next = cur.next;
                break;
            }
            cur = cur.next;
            cur2 = cur2.next;
        }
        return head;
    }
}
