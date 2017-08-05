package solution451to500;

/**
 * Created by Liu XZ on 2017/7/12.
 */
public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j=0;j<32;j++) {
            int bitCount = 0;
            for (int i=0;i<n;i++)
                bitCount += (nums[i] >> j) & 1;
            total += bitCount*(n - bitCount);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {4,14,2};
        Solution477 s477 = new Solution477();
        System.out.println(s477.totalHammingDistance(nums));
    }
}
