package solution121to130;

import java.util.Arrays;

public class Solution121
{
	public int maxProfit(int[] prices)
	{
		int profit = 0;
	    int min = Integer.MAX_VALUE;
	    for(int i=0; i<prices.length; i++){
	       profit = Math.max(profit, prices[i]-min);
	       min = Math.min(min, prices[i]);
	    }
	    return profit;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution121 s121 = new Solution121();
		int[] prices = { 23, 5646, 1, 616, 65, 1616, 48, 123, 549, 46516,
				5486410, 168, 1161, 8 };
		System.out.println(s121.maxProfit(prices));
	}

}
