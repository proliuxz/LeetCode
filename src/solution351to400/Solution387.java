package solution351to400;

import java.util.HashSet;

/**
 * Created by Xinzhuo Liu on 8/31/2016.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        int[] cache = new int[26];
        char[] charArray = s.toCharArray();
        for (char c: charArray
             ) {
            cache[c-'a']++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if (cache[charArray[i]-'a']==1)
                return i;
        }
        return -1;
    }
}
