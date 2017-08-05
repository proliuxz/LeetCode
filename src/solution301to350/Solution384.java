package solution301to350;

import java.util.Random;

/**
 * Created by liu.xinzhou on 20/7/2017.
 */
public class Solution384 {
    int[] nums;
    public Solution384 (int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = nums.clone();
        Random random = new Random();
        for (int i = 0; i < res.length; ++i) {
            int t = Math.abs(random.nextInt()) % res.length;
            int temp = res[t];
            res[t] = res[i];
            res[i] = temp;
        }
        return res;
    }
}
