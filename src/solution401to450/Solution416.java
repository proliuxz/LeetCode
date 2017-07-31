package solution401to450;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu.xinzhou on 30/6/2017.
 */
public class Solution416 {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0)
            return true;
        int sum = 0;
        for(int n : nums) sum += n;
        if(sum % 2 != 0 ) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for(int i = 0; i < nums.length; ++ i)
        {
            for(int j = sum; j >= nums[i] ; --j)
                dp[j] = dp[j] || dp[j - nums[i]];
        }
        return dp[sum];
    }

    public static void main (String[] args) {
        Solution416 s416 = new Solution416();
        int[] nums = {3,3,3,4,5};
        boolean res = s416.canPartition(nums);
        System.out.print(res);
    }
}
