package solution331to340;

/**
 * Created by Liu Xinzhuo on 2016/2/18 0018.
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

 Formally the function should:
 Return true if there exists i, j, k
 such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 Your algorithm should run in O(n) time complexity and O(1) space complexity.

 Examples:
 Given [1, 2, 3, 4, 5],
 return true.

 Given [5, 4, 3, 2, 1],
 return false.
 */
public class Solution334
{
    public boolean increasingTriplet(int[] nums)
    {
        int i,j,k;
        int len = nums.length;
        for (j = 1 ; j < len-1;j++ )
        {
            for (i=0;i<j;i++)
            {
                if (nums[i]<nums[j])
                    for (k=j+1;k<len;k++)
                    {
                        if (nums[k]>nums[j])
                            return true;
                    }
            }
        }
        return  false;
    }
}
