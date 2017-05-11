package solution201to250;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Liu Xinzhuo on 2015/9/15.
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        for (int i = 0; i < s.length();i++)
        {
            if (sChar[i]!=tChar[i])
                return false;
        }
        return true;
    }
}
