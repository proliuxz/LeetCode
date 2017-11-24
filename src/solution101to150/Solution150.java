package solution101to150;

import java.util.HashSet;
import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        HashSet<String> symbols = new HashSet<String>();
        symbols.add("+");
        symbols.add("-");
        symbols.add("*");
        symbols.add("/");
        for (String x: tokens
             ) {
            if(symbols.contains(x)) {
                int result = 0;
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (x) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                }
                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(x));
            }
        }

        if(stack.size()==1)
            return stack.pop();
        else
            return -1;
    }

    public static void main(String[] args) {
        Solution150 s150 = new Solution150();
        String[] s= {"4", "13", "5", "/", "+"};
        System.out.println(s150.evalRPN(s));
    }
}
