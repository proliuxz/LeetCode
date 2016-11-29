package solution461to470;

import java.util.List;

/**
 * Created by Xinzhuo on 2016/11/29 0029.
 */
public class Solution461 {
    public boolean canPartition(int[] nums) {
        if (nums==null||nums.length<2)
            return false;
        int sum = 0;
        for (int x: nums
             ) {
            sum+=x;
        }
        if (sum%2!=0)
            return false;
        int half = sum/2;
        return canPartitionHelper(half,0,nums);
    }

    public boolean canPartitionHelper(int target, int pos, int[] nums){
        if (pos>=nums.length)
            return false;
        if (target == nums[pos])
            return true;
        if (pos == nums.length)
            return false;
        return canPartitionHelper(target, pos+1, nums) || canPartitionHelper(target-nums[pos], pos+1,nums);
    }
}
