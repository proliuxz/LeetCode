package solution401to410;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Xinzhuo Liu on 10/12/2016.
 * 409. Longest Palindrome  QuestionEditorial Solution  My Submissions
 Total Accepted: 6904 Total Submissions: 15231 Difficulty: Easy
 Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        int len =0;
        HashSet hs = new HashSet<Character>();
        char[] sChar = s.toCharArray();
        for (char x: sChar ) {
            if (hs.add(x)==false)
            {
                hs.remove(x);
                len += 2;
            }
        }
        if (hs.size()!=0)
            len += 1;
        return len;
    }
}
