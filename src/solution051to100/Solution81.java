package solution051to100;

public class Solution81
{
	public boolean search(int[] nums, int target)
	{

		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right) / 2;
		while (left <= right)
		{

			mid = (left + right) / 2;
			if (target == nums[mid])
				return true;
			if (nums[left] < nums[mid])
			{
				if ((target >= nums[left] && target < nums[mid]))
					right = mid - 1;
				else
					left = mid + 1;
			} else if (nums[left] > nums[mid])
			{
				if ((target > nums[mid] && target <= nums[right]))
					left = mid + 1;
				else
					right = mid - 1;
			} else
			{
				left++;
			}
		}
		return false;

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution81 s81 = new Solution81();
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		System.out.println(s81.search(nums, target));
	}

}
