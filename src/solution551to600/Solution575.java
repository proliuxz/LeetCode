package solution551to600;

import java.util.HashSet;

/**
 * Created by Liu XZ on 2017/5/10.
 */
public class Solution575 {
    public int distributeCandies(int[] candies) {
        HashSet hs = new HashSet<Integer>();
        for (int candy: candies
             ) {
            hs.add(candy);
        }
        return Math.min(hs.size(),candies.length/2);
    }
}
