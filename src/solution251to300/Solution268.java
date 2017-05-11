package solution251to300;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Liu Xinzhuo on 2015/9/16.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the arrray.

 For example,
 Given nums = [0, 1, 3] return 2.
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len*(len+1))/2;
        for(int i = 0 ; i < len; i++){
            sum -= nums[i];
        }
        return sum;
    }
}
