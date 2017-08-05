package solution201to250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liu.xinzhou on 20/7/2017.
 */
public class Solution244 {
    HashMap<String,List<Integer>> hashMap = new HashMap<String,List<Integer>>();
    public Solution244(String[] words) {
        for (int i = 0; i <words.length ; i++) {
            List current = hashMap.getOrDefault(words[i],new ArrayList<Integer>());
            current.add(i);
            hashMap.put(words[i],current);
        }
    }

    public int shortest(String word1, String word2) {
        int res = Integer.MAX_VALUE;
        List<Integer> w1 = hashMap.get(word1);
        List<Integer> w2 = hashMap.get(word2);
        for (int num1: w1
             ) {
            for (int num2: w2
                 ) {
                res = Math.min(res,Math.abs(num1-num2));
            }
        }
        return res;
    }
}
