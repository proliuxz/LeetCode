package solution601to650;

import java.util.ArrayList;
import java.util.List;

public class Solution667 {
    public int[] constructArray(int n, int k) {
        if (n-k<1)
            return new int[0];
        int[] res = new int[n];
        for(int i = 1, j = n, pos=0; i <= j && pos< n;) {
            if(k>1) {
                res[pos] = (k--%2 == 1 ? i++ : j--);
            }else {
                res[pos] = i++;
            }
            pos++;
        }

        return res;
    }
}
