package solution551to600;

import java.util.HashMap;
import java.util.List;

/**
 * Created by liu.xinzhou on 1/8/2017.
 */
public class Solution554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = wall.size();
        int wallLen = 0;
        for (List<Integer> list: wall
                ) {
            int s = 0;
            for (int x: list
                    ) {
                s += x;
                map.put(s,map.getOrDefault(s,0)+1);
            }
            wallLen = s;
        }
        int max = 0;
        for (int key: map.keySet()
                ) {
            if (key != wallLen)
                max = Math.max(max,map.get(key));
        }
        return len - max;
    }
}
