package solution481to490;

/**
 * Created by Xinzhuo Liu on 3/6/2017.
 */
public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0)
            return result;
        if (nums.length == 1)
            return nums[0] == 0 ? 0 : 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = nums[i - 1] + 1;
                result = Math.max(result, nums[i]);
            }
        }
        return result;
    }
}
