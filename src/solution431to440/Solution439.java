package solution431to440;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution439 {
    public String parseTernary(String expression) {
        if (expression == null || expression.length() == 0)
            return new String();
        Stack<Character> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (!stack.isEmpty() && stack.peek() == '?')
            {
                stack.pop(); //pop '?'
                char first = stack.pop();
                stack.pop(); //pop ':'
                char second = stack.pop();
                if (c == 'T')
                    stack.push(first);
                else stack.push(second);
            } else {
                stack.push(c);
            }
        }
        return String.valueOf(stack.peek());
    }
}
