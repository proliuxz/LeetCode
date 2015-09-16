package solution251to260;

import Util.Interval;
import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.ir.LiteralNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Liu Xinzhuo on 2015/9/16.
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class Solution260 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i= 0 ; i<nums.length ;i++)
        {
            if (hashSet.contains(nums[i]))
                hashSet.remove(nums[i]);
            else
                hashSet.add(nums[i]);
        }
        int[] result = new int[hashSet.size()];
        int i = 0;
        for (int x:hashSet)
            result[i++]= x;
        return  result;
    }
}
