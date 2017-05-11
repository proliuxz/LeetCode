package solution151to200;

public class Solution198
{
	public int rob(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return 0;

		int n = nums.length;

		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 2; i < n + 1; i++)
		{
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
		}

		return dp[n];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution198 s198 = new Solution198();
		int[] nums = { 12, 84, 64, 6, 46, 88, 64, 654, 654, 78, 74984, 94, 944 };
		System.out.println(s198.rob(nums));
	}

}
