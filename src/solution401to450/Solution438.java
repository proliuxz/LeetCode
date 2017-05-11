package solution401to450;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/12/2016.
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p == null || s == null || s.length() < p.length()) return res;
        int m = s.length(), n = p.length();
        for (int i = 0; i < m - n + 1; i++) {
            String cur = s.substring(i, i + n);
            if (check(cur, p)) res.add(i);
        }
        return res;
    }

    public boolean check(String s, String p) {
        if (s == null || p == null || s.length() != p.length())
            return false;
        int[] letters = new int[26];
        for (char sc : s.toCharArray()
                ) {
            letters[sc - 'a']++;
        }
        for (char pc : p.toCharArray()
                ) {
            letters[pc - 'a']--;
            if (letters[pc - 'a'] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution438 s438 = new Solution438();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(s438.findAnagrams(s, p));
    }
}
