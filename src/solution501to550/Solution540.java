package solution501to550;

/**
 * Created by Liu XZ on 2017/7/10.
 */
public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len / 2;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[2 * mid] != nums[2 * mid + 1])
                right = mid;
            else left = mid + 1;
        }
        return nums[2 * left];
    }
}
