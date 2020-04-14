package 剑指offer;

import java.util.ArrayList;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class 从头到尾打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode next = null;
        ListNode pre = null;
        while (listNode != null){
            next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;

        }
        while (pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}
