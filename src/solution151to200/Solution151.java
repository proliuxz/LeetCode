package solution151to200;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Xinzhuo Liu on 12/5/2016.
 * 151. Reverse Words in a String   Add to List QuestionEditorial Solution  My Submissions
 * Total Accepted: 131366
 * Total Submissions: 836354
 * Difficulty: Medium
 * Contributors: Admin
 * Given an input string, reverse the string word by word.
 * <p>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class Solution151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = "1";
        Solution151 s151 = new Solution151();
        System.out.println(s151.reverseWords(s));
    }
}
