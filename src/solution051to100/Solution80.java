package solution051to100;

public class Solution80
{
	 public int removeDuplicates(int[] nums) {
		 if (nums.length==0)
				return 0;
			if (nums.length==1)
				return 1;
			int count = 1;
			boolean flag = false;
			for (int i = 0 ; i < nums.length-1;i++)
			{
				if(nums[i]==nums[i+1])
				{
					if (flag == false)
					{
						nums[count] = nums[i+1];
						count++;
						flag = true;
					}
					else
					{
						continue;
					}
				}
					
				else
				{
					flag = false;
					nums[count] = nums[i+1];
					count++;
				}
			}
			return count;
	        
	    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int nums[] = {2,31,2,5,43,3,45,6,4,34,53,45,7,45,6,435};
		Solution80 s80 = new Solution80();
		System.out.println(s80.removeDuplicates(nums));
	}

}
