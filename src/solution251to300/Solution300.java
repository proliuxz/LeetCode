package solution251to300;

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
        if(nums==null||nums.length==0)
            return 0;
        int[] d = new int[nums.length];
        d[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length ; i++)
        {
            d[i] = 1;
            for (int j = 0; j <i ; j++)
            {
                if (nums[i] > nums[j])
                    d[i] = Math.max(d[i],d[j]+1);
            }
            max = Math.max(max,d[i]);
        }
        return max;
    }
}
