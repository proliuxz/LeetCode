package solution241to250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/8/2016.
 * 249. Group Shifted Strings   Add to List QuestionEditorial Solution  My Submissions
 * Total Accepted: 18163
 * Total Submissions: 48115
 * Difficulty: Easy
 * Contributors: Admin
 * Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
 * <p>
 * "abc" -> "bcd" -> ... -> "xyz"
 * Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.
 * <p>
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
 * A solution is:
 * <p>
 * [
 * ["abc","bcd","xyz"],
 * ["az","ba"],
 * ["acef"],
 * ["a","z"]
 * ]
 * Show Company Tags
 * Show Tags
 * Show Similar Problems
 */
public class Solution249 {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> patterns = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String pattern = calcPattern(strings[i]);
            if (patterns.containsKey(pattern)) {
                patterns.get(pattern).add(strings[i]);
            }
            else {
                List tmpList = new ArrayList();
                tmpList.add(strings[i]);
                patterns.put(pattern,tmpList);
            }
        }
        Iterator<List<String>> iter = patterns.values().iterator();
        while (iter.hasNext()) {
            result.add(iter.next());
        }
        return result;
    }

    private String calcPattern(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars
                ) {
            int x = c - chars[0];
            while (x<0)
                x+=26;
            sb.append(x+",");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution249 s249 = new Solution249();
        String s = "am";
        System.out.println(s249.calcPattern(s));
    }
}
