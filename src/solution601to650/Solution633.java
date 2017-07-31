package solution601to650;

import java.util.HashSet;

/**
 * Created by liu.xinzhou on 5/7/2017.
 */
public class Solution633 {
    public boolean judgeSquareSum(int c) {
        if (c==0)
            return true;
        int n =(int) Math.sqrt(c);
        int[] pow2 =  new int[n+1];
        for (int i = 0; i <= n ; i++) {
            pow2[i] = (int) Math.pow(i,2);
        }
        HashSet<Integer> set = new HashSet();
        for (int x: pow2
             ) {
            set.add(x);
        }
        for (int y: pow2
             ) {
            if (y>c/2)
                return false;
            if (set.contains(c-y))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution633 s633 = new Solution633();
        int c = 5;
        System.out.print(s633.judgeSquareSum(4));
    }
}
