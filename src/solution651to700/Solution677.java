package solution651to700;

import java.util.HashMap;

public class Solution677 {
    HashMap<String,Integer> map;
    /** Initialize your data structure here. */
    public Solution677() {
        map = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int result = 0;
        for (String k: map.keySet()
             ) {
            if (k.startsWith(prefix))
                result += map.get(k);
        }
        return result;
    }
}
