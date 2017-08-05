package solution401to450;

import Util.ListNode;

import java.util.Stack;

/**
 * Created by Liu XZ on 2017/7/30.
 */
public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> ls1, ls2;
        Stack<Integer> resStack = new Stack<Integer>();
        ls1 = store(l1);
        ls2 = store(l2);
        int val1 = 0;
        int val2 = 0;
        int flag = 0;
        int result = 0;
        while (!ls1.empty() || !ls2.empty() ){
            val1 = ls1.empty()?0:ls1.pop();
            val2 = ls2.empty()?0:ls2.pop();
            result = val1 + val2 + flag;
            flag = result / 10;
            result = result % 10;
            resStack.push(result);
        }
        if (flag!=0)
            resStack.push(flag);
        ListNode fakeHead = new ListNode(0);
        ListNode head = new ListNode(0);
        fakeHead.next = head;
        while (!resStack.empty())
        {
            head.next = new ListNode(resStack.pop());
            head = head.next;
        }
        return fakeHead.next.next;
    }

    private Stack<Integer> store(ListNode node)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while (node!=null) {
            stack.push(node.val);
            node = node.next;
        }
        return stack;
    }

    public static void main(String[] args) {
        Solution445 s445 = new Solution445();
        ListNode ln11 = new ListNode(7);
        ListNode ln12 = new ListNode(2);
        ListNode ln13 = new ListNode(4);
        ListNode ln14 = new ListNode(3);
        ln11.next = ln12;
        ln12.next = ln13;
        ln13.next = ln14;

        ListNode ln21 = new ListNode(5);
        ListNode ln22 = new ListNode(6);
        ListNode ln23 = new ListNode(4);
        ln21.next = ln22;
        ln22.next = ln23;

        ListNode res = s445.addTwoNumbers(ln11,ln21);
    }
}
