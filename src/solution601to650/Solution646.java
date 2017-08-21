package solution601to650;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by liu.xinzhou on 28/7/2017.
 */
public class Solution646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,this.IntArrayComparator);
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
            }
        }
        return dp[pairs.length - 1];
    }

    private static Comparator<int[]> IntArrayComparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0]-o2[0];
        }
    };

    public static void main (String[] args) {
        int[][] pairs = {{2,3},{3,4},{1,2}};
        Solution646 s646 = new Solution646();
        System.out.print(s646.findLongestChain(pairs));
    }
}
