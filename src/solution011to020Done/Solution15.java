package solution011to020Done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15
{
	public List<List<Integer>> threeSum(int[] num)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(num);
		int left = 0;
		int mid = 1;
		int right = num.length - 1;
		for (left = 0; left <= num.length - 3; left++)
		{
			if (left != 0 && num[left] == num[left - 1])
				continue;
			mid = left + 1;
			right = num.length - 1;
			while (mid < right)
			{
				if (num[left] + num[mid] + num[right] == 0)
				{
					List<Integer> tempResult = new ArrayList<Integer>();
					tempResult.add(num[left]);
					tempResult.add(num[mid]);
					tempResult.add(num[right]);
					result.add(tempResult);
					mid++;
					right--;
					while (mid < right && num[mid] == num[mid - 1])
					{
						mid++;
					}
					while (mid < right && num[right] == num[right + 1])
					{
						right--;
					}
				} else if (num[left] + num[mid] + num[right] > 0)
				{
					right--;
				} else if (num[left] + num[mid] + num[right] < 0)
				{
					mid++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution15 s15 = new Solution15();
		int[] num = { -1,-1,-1,1};
		List<List<Integer>> result = s15.threeSum(num);
		System.out.println(result.size());
	}

}
