package solution451to460;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 11/22/2016.
 */
public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> hm  = new HashMap();
        int result = 0;
        for (int x: A
             ) {
            if (hm.containsKey(x)){
                hm.put(x,(hm.get(x)+1));
            }
            else{
                hm.put(x,1);
            }
        }
        for (int b: B
             ) {
            for (int c: C
                 ) {
                for (int d: D
                     ) {
                    if (hm.containsKey(0-b-c-d))
                        result = result + hm.get(0-b-c-d);
                }
            }
        }
        return result;
    }
}
