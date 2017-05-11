package solution451to500;

/**
 * Created by Xinzhuo Liu on 11/10/2016.
 */
public class Solution453 {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min * nums.length;
    }
}
