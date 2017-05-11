package solution151to200;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 8/26/2016.
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target)
    {
        int l = 0;
        int r = numbers.length - 1;
        while (l<r)
        {
            if (numbers[l] + numbers[r] == target)
                return new int[]{ l+1, r+1};
            if (numbers[l] + numbers[r] < target)
                l++;
            if (numbers[l] + numbers[r] > target)
                r--;
        }
        return null;
    }
}
