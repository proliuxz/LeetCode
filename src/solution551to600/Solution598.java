package solution551to600;

/**
 * Created by liu.xinzhou on 6/6/2017.
 */
public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op: ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
