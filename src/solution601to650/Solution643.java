package solution601to650;

/**
 * Created by liu.xinzhou on 19/7/2017.
 */
public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int resultNum = len-k+1;
        double maxSum = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i <k ; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = 1; i <resultNum ; i++) {
            sum -= nums[i-1];
            sum += nums[k+i-1];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
    public static void main (String[] args) {
        Solution643 s643 = new Solution643();
        int[] nums = { 1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(s643.findMaxAverage(nums,k));
    }
}
