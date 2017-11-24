package solution301to350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Character,List<Integer>> hashMap = new HashMap<Character, List<Integer>>();
        for (int i = 0; i < words.length; i++) {
            char key = words[i].charAt(0);
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && isPalindrome(words[i] + words[j])) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(i);
                    tmp.add(j);
                    result.add(tmp);
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() >> 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution336 s336 = new Solution336();
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> result = s336.palindromePairs(words);
    }
}
