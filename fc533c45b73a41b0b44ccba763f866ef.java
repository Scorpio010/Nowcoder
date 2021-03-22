package Homework.Nowcoder;

public class fc533c45b73a41b0b44ccba763f866ef {
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    // 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode newhead = new ListNode(-1);
        newhead.next = pHead;
        ListNode prev = newhead;
        ListNode p1 = pHead;
        ListNode p2 = pHead.next;
        while (p2 != null) {
            if (p1.val != p2.val) {
                prev = prev.next;
                p1 = p1.next;
                p2 = p2.next;
            } else {
                while (p2!=null&&p1.val==p2.val) {
                    p2 = p2.next;
                }
                p1 = p2;
                prev.next = p2;
                if (p2 != null) {
                    p2 = p2.next;
                }
            }
        }
        return newhead.next;
    }
}
