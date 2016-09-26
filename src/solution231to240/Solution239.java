package solution231to240;

import Util.Show;

/**
 * Created by Liu Xinzhuo on 2016/5/23 0023.
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int idx =0;
        int[] result = new int[len-k+1];
        if (nums==null||len==0||k==0||k>len)
            return new int[0];

        for (int i = 1; i <k ; i++)
            if (max < nums[i])
            {
                max = nums[i];
                idx = -1;
            }
        result[0] = max;

        for(int i = 1; i < nums.length - k + 1; i ++)
        {
            if (max < nums[i + k - 1])
            {
                max = nums[i + k - 1];
                idx = i + k - 1;
            }
            if (idx < i)
            {
                max = Integer.MIN_VALUE;
                idx = 0;
                for (int j = 0; j < k; j++)
                    if (max < nums[i + j])
                    {
                        max = nums[i + j];
                        idx = i + j;
                    }
            }
            result[i] = max;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Solution239 solution239 = new Solution239();
        int[] A = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Show.showArray(solution239.maxSlidingWindow(A,k));
    }
}
