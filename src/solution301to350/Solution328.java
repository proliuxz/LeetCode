package solution301to350;

import Util.ListNode;

/**
 * Created by Liu Xinzhuo on 2016/1/27 0027.
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.
 */
public class Solution328 {

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {//元素个数<3，直接返回头
            return head;
        }

        ListNode even = head.next, odd = head, evenHead = head.next;

        while(even != null && even.next != null) { //元素个数>=3&&循环能继续(even.next有值)
            odd.next = even.next; //odd元素指针指向even的下一个元素
            odd = odd.next;       //odd指针后移
            even.next = odd.next; //even元素指向odd的下一个元素
            even = even.next;     //even指针后移
        }
        odd.next = evenHead;//对接odd尾和even的头
        return head;
    }
}
