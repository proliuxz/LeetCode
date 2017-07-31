package solution501to550;

import java.util.Stack;

/**
 * Created by liu.xinzhou on 14/6/2017.
 */
public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 2* nums.length -1; i > 0 ; i--) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }
}
