package solution601to650;

import java.util.Arrays;

public class Solution611 {
    public int triangleNumber(int[] nums) {
        int res = 0;
        if (nums== null || nums.length<3)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2 ; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k])
                    k++;
                res += k - j - 1;
            }
        }
        return res;
    }

    private boolean isValid(int a, int b, int c) {
        return a+b>c && Math.abs(a-b)<c;
    }
}
