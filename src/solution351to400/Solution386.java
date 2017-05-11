package solution351to400;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 11/10/2016.
 */
public class Solution386 {
        public List<Integer> lexicalOrder(int n) {
            List ret = new ArrayList<Integer>();
            int cur =1;
            for (int i = 0; i<n; i++)
            {
                ret.add(cur);
                if (cur * 10 <= n) {
                    cur *= 10;
                } else {
                    if (cur >= n)
                        cur /= 10;
                    cur += 1;
                    while (cur % 10 == 0) cur /= 10;
                }
            }
            return ret;
        }
    }
