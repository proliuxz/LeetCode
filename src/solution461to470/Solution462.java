package solution461to470;

import java.util.Arrays;

/**
 * Created by Xinzhuo Liu on 11/22/2016.
 */
public class Solution462 {
    public int minMoves2(int[] nums) {
        int result = 0;
        if (nums==null||nums.length==0||nums.length==1)
            return result;
        Arrays.sort(nums);
        int flag = nums[nums.length>>1];
        for (int num: nums
             ) {
            result += Math.abs(num-flag);
        }
        return result;
    }
}
