package solution231to240;

import Util.ListNode;

/**
 * Created by Liu Xinzhuo on 2015/9/15. 2015-9-15 17:51:04
 * Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null)
            return true;
        //find list center
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;
        //reverse second part of the list
        ListNode p1 = secondHead;
        ListNode p2 = p1.next;
        while(p1!=null && p2!=null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        secondHead.next = null;
        //compare two sublists now
        ListNode p = (p2==null?p1:p2);
        ListNode q = head;
        while(p!=null){
            if(p.val != q.val)
                return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }
}
