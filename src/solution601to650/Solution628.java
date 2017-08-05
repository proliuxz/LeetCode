package solution601to650;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by liu.xinzhou on 3/7/2017.
 */
public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-3]*nums[len-2]*nums[-1]);
    }
}
