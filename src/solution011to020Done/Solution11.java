package solution011to020Done;

public class Solution11
{
	public int maxArea(int[] height) {
		
		int left = 0;
		int right = height.length-1;
		int result = 0;
		
		int tempResult = Math.min(height[left], height[right]) * (right-left);
		result = Math.max(result, tempResult);
		
		while (left<right)
		{
			
			if (height[left]<height[right])
			{
				left++;
			}
			else
			{
				right--;
			}
			tempResult = Math.min(height[left], height[right]) * (right-left);
			result = Math.max(result, tempResult);
		}
		return result;
    }
	
	
	public static void main(String[] args)
	{
		Solution11 s11 = new Solution11();
		int[] height = {1,2,4,3};
		System.out.println(s11.maxArea(height));
	}

}
