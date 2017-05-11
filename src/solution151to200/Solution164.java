package solution151to200;

import java.util.Arrays;

/**
 * Created by Liu Xinzhuo on 2016/5/25 0025.
 */
public class Solution164 {
    public int maximumGap(int[] nums) {
        if (nums==null||nums.length<2)
            return 0;
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length-1 ; i++)
            max = Math.max(max, Math.abs(nums[i + 1] - nums[i]));
        return max;
    }
}
