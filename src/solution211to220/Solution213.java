package solution211to220;

public class Solution213
{
	public int rob(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return 0;

		int n = nums.length;

		if (n == 1)
		{
			return nums[0];
		}
		if (n == 2)
		{
			return Math.max(nums[1], nums[0]);
		}

		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 2; i < n; i++)
		{
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
		}

		int[] dr = new int[n + 1];
		dr[0] = 0;
		dr[1] = nums[1];

		for (int i = 2; i < n; i++)
		{
			dr[i] = Math.max(dr[i - 1], dr[i - 2] + nums[i]);
		}

		return Math.max(dp[n - 1], dr[n - 1]);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		Solution213 s213 = new Solution213();
		System.out.println(s213.rob(nums));
	}

}
