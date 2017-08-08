package solution601to650;

import java.util.HashSet;

/**
 * Created by Liu XZ on 2017/7/23.
 */
public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = nums.length;
        int sum = (1+len)*len/2;
        for (int num: nums) {
            sum -= num;
            if (!hs.add(num)){
                result[0] = num;
            }
        }
        result[1] = result[0] + sum;
        return result;
    }
}
