package solution151to200;

import java.util.Arrays;

public class Solution169
{
	public int majorityElement(int[] nums)
	{
		if (nums.length==1)
			return nums[0];
		Arrays.sort(nums);
		return nums[0]==nums[nums.length/2]?nums[nums.length/2]:nums[nums.length/2+1];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution169 s169 = new Solution169();
		int[] nums = {1,512,4,6,13,6,4,1,6,65,6,7,6,6,6,0};
		System.out.println(s169.majorityElement(nums));
	}
}
