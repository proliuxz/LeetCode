package solution351to400;

import Util.ListNode;

import java.util.Random;

/**
 * Created by Xinzhuo Liu on 10/12/2016.
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

 Follow up:
 What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

 Example:

 // Init a singly linked list [1,2,3].
 ListNode head = new ListNode(1);
 head.next = new ListNode(2);
 head.next.next = new ListNode(3);
 Solution solution = new Solution(head);

 // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 solution.getRandom();

    蓄水池抽样
 */
public class Solution382 {
    ListNode head;
    public Solution382(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        Random rand = new Random();
        ListNode head = this.head;
        int val = head.val;
        for (int i = 1; head!=null; i++) {
            if (rand.nextInt()%i==0)
                val = head.val;
            head = head.next;
        }
        return val;
    }
}
