package solution101to150;

public class Solution122
{
	public int maxProfit(int[] prices)
	{
		int result = 0;
		for (int i = 1 ; i < prices.length;i++)
		{
			int benefits = prices[i]-prices[i-1];
			if (benefits>0)
				result += benefits;
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution122 s122 = new Solution122();
		int[] prices = {1,54,3,7,4,8,4,89,0};
		System.out.println(s122.maxProfit(prices));
	}

}
