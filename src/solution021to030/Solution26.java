package solution021to030;

public class Solution26
{
	public int removeDuplicates(int[] nums)
	{
		if (nums.length==0)
			return 0;
		if (nums.length==1)
			return 1;
		int count = 1;
		for (int i = 0 ; i < nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
				continue;
			else
			{
				nums[count] = nums[i+1];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution26 s26 = new Solution26();
		int[] A = {1,2,3,4,5,5,5,5,6,7};
		System.out.println(s26.removeDuplicates(A));
	}

}
