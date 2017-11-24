package solution701to750;

import Util.ListNode;

public class Solution725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode ls = root;
        while (ls!=null)
        {
            ls = ls.next;
            len++;
        }
        int width = len/k;
        int rem = len % k;
        ListNode[] ans = new ListNode[k];
        ListNode cur = root;
        for (int i = 0; i < k; ++i) {
            ListNode head = new ListNode(0), write = head;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write = write.next = new ListNode(cur.val);
                if (cur != null) cur = cur.next;
            }
            ans[i] = head.next;
        }
        return ans;
    }
}
