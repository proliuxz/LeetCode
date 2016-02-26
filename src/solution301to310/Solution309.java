package solution301to310;

/**
 * Created by Liu Xinzhuo on 2016/1/15 0015.
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[] sell = new int[len];
        int[] coolDown = new int[len];
        sell[0] = 0;
        coolDown[0] = 0;
        for (int i = 1; i < len; i++) {
            sell[i] = Integer.max(sell[i - 1] + prices[i] - prices[i - 1], coolDown[i - 1]);
            coolDown[i] = Integer.max(sell[i - 1], coolDown[i - 1]);
        }
        return Integer.max(sell[len - 1], coolDown[len - 1]);
    }
}
