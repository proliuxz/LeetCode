package solution051to100;

import Util.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        Stack<Integer> stack  = new Stack<Integer>();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        while (head!=null) {
            stack.push(head.val);
            head = head.next;
        }
        for (int i = 0; i <k ; i++) {
            deque.addFirst(stack.pop());
        }
        while (!stack.empty()) {
            deque.addLast(stack.pop());
        }
        ListNode fakeHeader = new ListNode(0);
        ListNode header = new ListNode(0);
        fakeHeader.next = header;
        for (Integer val: deque
             ) {
            header.next = new ListNode(val);
            header = header.next;
        }
        return fakeHeader.next.next;
    }
}
