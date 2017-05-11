package solution051to100;

public class Solution66
{

	public int[] plusOne(int[] digits)
	{
		if (digits == null || digits.length == 0)
			return null;
		int plus = 1;
		for (int i = digits.length - 1; i >= 0; i--)
		{
			int temp = digits[i];
			digits[i] = (temp + plus) % 10;
			plus = (temp + plus) / 10;
			if (plus == 0)
				return digits;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution66 s66 = new Solution66();
		int nums[] = { 2, 5, 6, 5, 4, 5, 4, 2 };
		int[] result = s66.plusOne(nums);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

}
