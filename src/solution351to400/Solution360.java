package solution351to400;

import java.util.Arrays;

/**
 * Created by Liu XZ on 2017/7/23.
 */
public class Solution360 {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] res = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            res[i] = calc(nums[i],a,b,c);
        }
        Arrays.sort(res);
        return res;
    }

    private int calc(int x, int a, int b, int c) {
        return a*x*x + b*x + c;
    }
}
