package solution261to270;

/**
 * Created by Liu Xinzhuo on 2015/9/16.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        return findNumber(0,nums.length,nums);
    }
    public int findNumber(int begin,int end,int[] nums)
    {
        if (begin==end)
            return nums[0];
        int mid = (begin + end)/2;
        if (mid==nums[mid])
            return findNumber(mid+1,end,nums);
        else
            return findNumber(begin,mid,nums);
    }
}
