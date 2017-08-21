package solution451to500;

/**
 * Created by liu.xinzhou on 15/8/2017.
 */
public class Solution494 {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        if (nums==null||nums.length==0)
            return 0;
        calculate(nums,0,0, S);
        return count;
    }

    public void calculate(int[] nums, int pos, int sum, int target) {
        if (pos == nums.length) {
            if (sum==target)
                count++;
        }
        else {
            calculate(nums,pos+1,sum+nums[pos],target);
            calculate(nums,pos+1,sum-nums[pos],target);
        }
    }
}
