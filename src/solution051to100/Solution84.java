package solution051to100;

import java.util.Stack;

/**
 * Created by Liu XZ on 2017/9/17.
 */
public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        Stack < Integer > stack = new Stack< >();
        stack.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
                maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        while (stack.peek() != -1)
            maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() -1));
        return maxarea;
    }

    public static void main(String[] args) {
        Solution84 s84 = new Solution84();
        int[] heights = { 2,1,5,6,2,3};
        int res = s84.largestRectangleArea(heights);
    }
}
