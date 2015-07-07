package solution151to160;


public class Solution154
{
	public int findMin(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return 0;

		int left = 0;
		int right = nums.length - 1;
		int min = nums[0];
		while (left < right-1)
		{
			int mid = (left + right) / 2;
			if (nums[left] < nums[mid])
			{
				min = Math.min(nums[left], min);
				left = mid + 1;
			} 
			
			else if (nums[left] > nums[mid])
			{
				min = Math.min(nums[mid], min);
				right = mid - 1;
			} 
			
			else
			{
				left++;
			}
		}
		min = Math.min(min,(Math.min(nums[left], nums[right])));
		return min;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution154 s154 = new Solution154();
		int[] nums = { 7, 8, 9, 10, 5, 6, 4 };
		System.out.println(s154.findMin(nums));
	}

}
