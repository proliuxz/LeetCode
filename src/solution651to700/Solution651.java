package solution651to700;

/**
 * Created by liu.xinzhou on 2/8/2017.
 */
public class Solution651 {
    public int maxA(int N) {
        if (N<7) {
            return N;
        }
        int[] dp = new int[N + 1];
        for (int i = 1; i <= 6; i++) {
            dp[i] = i;
        }
        for (int i = 7; i <= N; i++) {
            dp[i] = Math.max(dp[i - 4] * 3, dp[i - 5] * 4);
            // dp[i] = Math.max(dp[i - 4] * 3, Math.max(dp[i - 5] * 4, dp[i - 6] * 5));
        }
        return dp[N];
    }
}
