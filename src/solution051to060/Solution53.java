package solution051to060;

public class Solution53
{
	public int maxSubArray(int[] nums)
	{
		int max = nums[0];
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
			max = Math.max(max, sum[i]);
		}

		return max;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution53 s53 = new Solution53();
		int[] nums = { 4, -5, 45, -6, -78, -6, -26, -6 };
		System.out.println(s53.maxSubArray(nums));
	}
}
