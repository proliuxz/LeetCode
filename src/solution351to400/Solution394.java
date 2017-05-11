package solution351to400;

import java.util.Stack;

/**
 * Created by Xinzhuo Liu on 10/25/2016.
 *
 * Given an encoded string, return it's decoded string.

 The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

 You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

 Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

 Examples:

 s = "3[a]2[bc]", return "aaabcbc".
 s = "3[a2[c]]", return "accaccacc".
 s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */
public class Solution394 {
    public String decodeString(String s) {
        String ret = new String();
        String tmp = new String();
        Stack<Integer> s_num = new Stack<>();
        Stack<String> s_str = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                cnt = 10 * cnt + c - '0';
            } else if (c == '[') {
                s_num.push(cnt);
                s_str.push(tmp);
                cnt = 0;
                tmp = new String();
            } else if (c == ']') {
                int k = s_num.peek();
                s_num.pop();
                for (int j = 0; j < k; ++j)
                    s_str.push(s_str.pop() + tmp);
                tmp = s_str.peek();
                s_str.pop();
            } else {
                tmp += c;
            }
        }
        return s_str.empty() ? tmp : s_str.peek();
    }
}
