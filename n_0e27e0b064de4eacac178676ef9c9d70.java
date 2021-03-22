package Homework.Nowcoder;

import java.util.List;

public class n_0e27e0b064de4eacac178676ef9c9d70 {
    //现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于
    // x的结点排在其余结点之前，且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
    public ListNode partition(ListNode pHead, int x) {
        ListNode last1 = new ListNode(-1);
        ListNode last2 = new ListNode(-1);
        ListNode head1 = last1;
        ListNode head2 = last2;
        for (ListNode cur = pHead;cur!=null; cur = cur.next){
            if (cur.val<x){
                last1.next = cur;
                last1 = cur;
            }else {
                last2.next = cur;
                last2 = cur;
            }
        }
        last1.next = head2.next;
        last2.next = null;
        return head1.next;
    }
}
