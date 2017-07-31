package solution551to600;

import java.util.Stack;

/**
 * Created by liu.xinzhou on 20/6/2017.
 */
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        Stack <Integer> bottom = new Stack <Integer> ();
        Stack <Integer> top = new Stack <Integer> ();
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!bottom.isEmpty() && nums[bottom.peek()] > nums[i])
                l = Math.min(l, bottom.pop());
            bottom.push(i);
            int j = nums.length-1-i;
            while (!top.isEmpty() && nums[top.peek()] < nums[j])
                r = Math.max(r, top.pop());
            top.push(j);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }
}
