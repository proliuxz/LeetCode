package solution051to100;

public class Solution88
{
	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (k >= 0)
		{
			if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution88 s88 = new Solution88();
		int[] nums1 = { 1, 2, 4, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0 };
		int[] nums2 = { 5, 8, 9, 15, 45, 68, 99 };
		s88.merge(nums1, 5, nums2, nums2.length);
		Util.Show.showArray(nums1);
	}

}
