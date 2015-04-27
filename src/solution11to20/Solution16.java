package solution11to20;

import java.util.Arrays;

public class Solution16
{
	public int threeSumClosest(int[] num, int target)
	{
		int result = 0;
		Arrays.sort(num);
		int left = 0;
		int mid = 1;
		int right = num.length - 1;
		boolean flag = true;
		for (left = 0; left <= num.length - 3; left++)
		{
			if (left != 0 && num[left] == num[left - 1])
			{
				continue;
			}
			mid = left + 1;
			right = num.length - 1;
			while (mid < right)
			{

				int sum = num[left] + num[mid] + num[right];
				if (flag || Math.abs(sum - target) < Math.abs(result - target))
				{
					result = sum;
				}
				flag = false;
				if (result - target == 0)
					return result;
				if (sum <= target)
				{
					mid++;
					while (mid < right && num[mid] == num[mid - 1])
					{
						mid++;
					}
				} else if (sum > target)
				{
					right--;
					while (mid < right && num[right] == num[right + 1])
					{
						right--;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution16 s16 = new Solution16();
		int[] num = { 1, 1, 1, 0 };
		int target = -100;
		System.out.println(s16.threeSumClosest(num, target));
	}

}
