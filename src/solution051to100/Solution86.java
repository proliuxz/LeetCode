package solution051to100;

import Util.ListNode;

/**
 * Created by Liu Xinzhuo on 2016/4/30 0030.
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {

        ListNode leftHead = new ListNode(0);
        ListNode rightHead = new ListNode(0);
        ListNode node = head;
        ListNode less = leftHead;
        ListNode greater = rightHead;

        while (node != null)
        {
            ListNode next = node.next;
            if (node.val < x)
            {
                less.next = node;
                less = less.next;
                less.next = null;
            }
            else
            {
                greater.next = node;
                greater = greater.next;
                greater.next = null;
            }
            node = next;
        }

        less.next = rightHead.next;
        return leftHead.next;
    }
}
