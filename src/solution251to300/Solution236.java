package solution251to300;

/**
 * Created by Xinzhuo Liu on 12/6/2016.
 */
public class Solution236 {
    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0)
            return 0;
        int n = costs.length, r = 0, g = 0, b = 0;
        for (int i = 0; i < n; i++) {
            int rr = r, bb = b, gg = g;
            r = costs[i][0] + Math.min(bb, gg);
            b = costs[i][1] + Math.min(rr, gg);
            g = costs[i][2] + Math.min(rr, bb);
        }
        return Math.min(r, Math.min(b, g));
    }
}
