package solution501to550;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by liu.xinzhou on 3/7/2017.
 */
public class Solution532 {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> resultSum = new HashSet<Integer>();
        if (nums==null||nums.length==0)
            return 0;
        Arrays.sort(nums);
        for (int i = 0, j=i+1; i <nums.length-1 &&j<nums.length ;) {
            if (nums[i]+k>nums[j])
            {
                j++;
            }
            else if (nums[i]+k==nums[j])
            {
                resultSum.add(nums[i]+nums[j]);
                System.out.println("i="+i);
                System.out.println("j="+j);
                j++;
            }
            else
            {
                i++;
                j=i+1;
            }
        }
        return resultSum.size();
    }

    public static void main (String[] args){
        Solution532 s532 = new Solution532();
        int[] nums = {3,1,4,1,5};
        int k = 2;
        int result = s532.findPairs(nums,k);
        System.out.println(result);
    }
}
