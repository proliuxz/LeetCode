package solution051to100;

public class Solution55
{

	public boolean canJump(int[] nums)
	{
		if (nums.length == 0 || nums == null)
			return true;
		if (nums.length == 1)
			return true;
		int jump = nums[0];

		for (int i = 0; i < nums.length; i++)
		{
			if (jump <= i && nums[i] == 0)
				return false;

			if (i + nums[i] > jump)
			{
				jump = i + nums[i];
			}

			if (jump >= nums.length - 1)
				return true;
		}

		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution55 s55 = new Solution55();
		int[] nums1 = { 2, 3, 1, 1, 4 };
		int[] nums2 = { 3, 2, 1, 0, 4 };
		System.out.println(s55.canJump(nums1));
		System.out.println(s55.canJump(nums2));
	}

}
