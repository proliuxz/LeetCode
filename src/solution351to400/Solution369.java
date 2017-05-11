package solution351to400;

import Util.ListNode;

import java.util.Stack;

/**
 * Created by Xinzhuo Liu on 11/30/2016.
 */
public class Solution369 {
    int carry = 0;
    public ListNode plusOne(ListNode head) {
        if (head==null)
            return null;
        Stack<ListNode> stack = new Stack();
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        stack.add(fakeHead);
        while (head.next!=null)
        {
            stack.push(head);
            head = head.next;
        }
        if (head.val + 1 == 10) {
            head.val = 0;
            carry = 1;
            while (carry == 1)
            {
                ListNode node = stack.pop();
                int sum = node.val + carry;
                node.val = sum%10;
                carry = sum/10;
            }
        }
        else {
            head.val = head.val + 1;
            return fakeHead.next;
        }
        return fakeHead.val==0 ? fakeHead.next : fakeHead;
    }
}
