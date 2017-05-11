package solution301to350;

import java.util.Stack;

/**
 * Created by Xinzhuo Liu on 11/9/2016.
 */
public class Solution316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        for(char c : arr) {
            count[c-'a']++;
        }
        boolean[] visited = new boolean[26];
        for(char c : arr) {
            count[c-'a']--;
            if(visited[c-'a']) {
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > c && count[stack.peek()-'a'] > 0) {
                visited[stack.peek()-'a'] = false;
                stack.pop();
            }
            stack.push(c);
            visited[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Solution316 s316 = new Solution316();
        String s = "bcabc";
        System.out.println(s316.removeDuplicateLetters(s));
    }
}
