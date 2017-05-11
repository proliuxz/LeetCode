package solution151to200;

public class Solution162
{
	public int findPeakElement(int[] nums)
	{
		if (nums.length == 1)
			return 0;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right)
		{
			if (left == right)
				return left;
			int mid = (left + right) / 2;
			if (nums[mid] > nums[mid + 1])
				right = mid;
			else
				left = mid + 1;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = { 156, 4984, 61, 6468, 4654, 654, 64, 64, 654, 5648, 465,
				13, 165, 4, 6165, 4, 984, 9465 };
		Solution162 s162 = new Solution162();
		System.out.println(s162.findPeakElement(nums));
	}
}
