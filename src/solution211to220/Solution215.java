package solution211to220;

import java.util.Arrays;

public class Solution215
{
	public int findKthLargest(int[] nums, int k)
	{
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution215 s215 = new Solution215();
		int[] nums = { 2, 9, 7, 56, 468, 4646, 384, 317, 222 };
		int k = 2;
		System.out.println(s215.findKthLargest(nums, k));
	}

}
