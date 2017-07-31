package solution451to500;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 11/22/2016.
 */
public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> hm  = new HashMap();
        for (int a : A
             ) {
            for (int b: B
                 ) {
                hm.put(a+b,hm.getOrDefault(a+b,0)+1);
            }
        }

        int result = 0;
        for (int c: C
             ) {
            for (int d: D
                 ) {
                int res = 0-c-d;
                result += hm.getOrDefault(res,0);
            }
        }
        return result;
    }
}
