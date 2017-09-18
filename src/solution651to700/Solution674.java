package solution651to700;

/**
 * Created by Liu XZ on 2017/9/10.
 */
public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int cnt = 0;
        for(int i = 0; i<nums.length; i++){
            if(i == 0 || nums[i-1] < nums[i])
            {
                cnt ++;
                res = Math.max(res, cnt);
            }
            else
                cnt = 1;
        }
        return res;
    }
}
