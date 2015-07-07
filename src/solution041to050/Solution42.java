package solution041to050;

public class Solution42
{

	public int trap(int[] height)
	{
		int len = height.length;
		if (len < 3)
			return 0;

		int result = 0;
		int[] left = new int[len];
		int[] right = new int[len];

		left[0] = height[0];
		right[len - 1] = height[len - 1];

		for (int i = 1; i < len - 1; i++)
			left[i] = Math.max(left[i - 1], height[i]);

		for (int i = len - 2; i >= 0; i--)
		{
			right[i] = Math.max(right[i + 1], height[i]);
		}

		for (int i = 0; i < len - 1; i++)
		{
			result += Math.min(left[i], right[i]) - height[i];
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution42 s42 = new Solution42();
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(s42.trap(height));
	}

}
