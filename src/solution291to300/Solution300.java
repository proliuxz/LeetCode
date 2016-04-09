package solution291to300;

import sun.rmi.log.LogInputStream;

/**
 * Created by Liu Xinzhuo on 2015/12/20.
 *
 * On2: dp[i] = max{dp[j]+1}, 1<=j<i,a[j]<a[i].
 * 1. 设当前已求出的最长上升子序列的长度为len（初始时为1），每次读入一个新元素x：
 * 2. 若x>d[len]，则直接加入到d的末尾，且len++；（利用性质2）
 * 否则，在d中二分查找，找到第一个比x小的数d[k]，并d[k+1]=x，在这里x<=d[k+1]一定成立
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        LIS(nums,nums.length,result);
        return result.length;
    }
    public int BinSearch(int key,int[] nums, int left, int right)
    {
        while (left<right)
        {
            int mid = (left+right)>>1;
            if (key>nums[mid] && key <=nums[mid+1])
                return mid;
            else if (key<nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return 0;
    }
    public int LIS(int[] nums, int n, int[] result)
    {
        int i,j;
        result[1] = nums[1];
        int len = 1;
        for (i = 2;i<n; i++)
        {
            if (result[len]<nums[i])
                j = ++len;
            else
                j = BinSearch(nums[i],result,1,len)+1;
            result[j] = nums[j];
        }
        return len;
    }
}
