package solution701to750;

import java.util.Stack;

public class Solution716 {
    Stack<Integer> nums;
    Stack<Integer> max;
    Stack<Integer> popped;
    public Solution716() {
        nums = new Stack<Integer>();
        max = new Stack<Integer>();
        popped = new Stack<Integer>();
    }

    public void push(int x) {
        nums.push(x);
        if (max.isEmpty() || x >= max.peek())
            max.push(x);
    }

    public int pop() {
        int val = nums.pop();
        if (!max.isEmpty() &&  max.peek() == val)
            max.pop();
        return val;
    }

    public int top() {
        return nums.peek();
    }

    public int peekMax() {
        if (max.isEmpty())
            return nums.peek();
        return max.peek();
    }

    public int popMax() {
        int res = !max.isEmpty() ? max.pop() : nums.peek();
        while (!nums.isEmpty() && nums.peek() != res)
            popped.push(nums.pop());

        nums.pop();
        while (!popped.isEmpty())
            push(popped.pop());
        return res;
    }
}
