package solution031to040;

public class Solution35
{
	public int searchInsert(int[] nums, int target)
	{
		int result = 0;
		if (nums.length == 0 || nums == null)
			return result;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i]>=target)
				return i;
			else
			{
				result = i;
			}
		}
		return result+1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution35 s35 = new Solution35();
		int[] num = { 1, 2, 3, 5, 7, 8, 9 };
		int target = 4;
		System.out.println(s35.searchInsert(num, target));
	}

}
