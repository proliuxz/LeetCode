package solution351to400;

import java.util.Random;

public class Solution398 {
    int[] nums;
    Random rand;
    public Solution398(int[] nums) {
        this.nums = nums;
        this.rand = new Random();
    }

    public int pick(int target) {
        int count = 0;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            if (rand.nextInt(++count) == 0)
                res = i;
        }
        return res;
    }
}
