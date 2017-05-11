package solution101to150;

import Util.Show;
import Util.ListNode;

/**
 * Created by Liu Xinzhuo on 2016/4/25 0025.
 */
public class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        if (head==null)
            return null;
        ListNode cur = head;
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        while (cur!=null)
        {
            ListNode pos = cur.next;
            pre = fakeHead;
            while (pre.next!=null && pre.next.val<cur.val)
            {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = pos;
        }
        return fakeHead.next;
    }

    public static void main(String[] args)
    {
        Solution147 solution147 = new Solution147();
        ListNode ln1 = new ListNode(7);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(4);
        ListNode ln4 = new ListNode(9);
        ListNode ln5 = new ListNode(5);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ListNode result = solution147.insertionSortList(ln1);
        Show.showListNode(result);
    }
}
