package solution551to600;

import java.util.Arrays;

/**
 * Created by Liu XZ on 2017/5/1.
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
