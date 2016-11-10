package solution371to380;

/**
 * Created by Xinzhuo Liu on 10/19/2016.
 * Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
 * <p>
 * Example:
 * <p>
 * nums = [1, 2, 3]
 * target = 4
 * <p>
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * <p>
 * Note that different sequences are counted as different combinations.
 * <p>
 * Therefore the output is 7.
 * Follow up:
 * What if negative numbers are allowed in the given array?
 * How does it change the problem?
 * What limitation we need to add to the question to allow negative numbers?
 */
public class Solution377 {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        for (int i = 0; i <= target; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i - nums[k] > 0) {
                    dp[i] += dp[i - nums[k]];
                } else if (i - nums[k] == 0) {
                    dp[i] += 1;
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution377 s377 = new Solution377();
        int[] nums = {1, 2, 3, 4};
        int target = 12;
        System.out.println(s377.combinationSum4(nums, target));
    }
}
