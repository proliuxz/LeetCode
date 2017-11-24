package solution101to150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution140 {
    private HashMap<Integer, List<String>> map;
    private HashSet<String> dics;
    Solution140() {
        map = new HashMap<Integer, List<String>>();
        dics = new HashSet<String>();
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        for (String w: wordDict
             ) {
            dics.add(w);
        }
        return helper(s,0);
    }

    private List<String> helper(String s, int idx) {
        if (map.containsKey(idx)) {
            return map.get(idx);
        }
        LinkedList<String> res = new LinkedList<>();
        if (idx == s.length()) {
            res.add("");
        }
        for (int end = idx + 1; end <= s.length(); end++) {
            if (dics.contains(s.substring(idx, end))) {
                List<String> list = this.helper(s, end);
                for (String l : list) {
                    res.add(s.substring(idx, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(idx, res);
        return res;
    }
}
