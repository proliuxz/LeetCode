package solution311to320;

/**
 * Created by Liu Xinzhuo on 2016/1/29 0029.
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

 Find the maximum coins you can collect by bursting the balloons wisely.

 Note:
 (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100

 Example:

 Given [3, 1, 5, 8]

 Return 167

 nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 */
public class Solution312 {
    public int maxCoins(int[] nums)
    {
        int[] temp = new int[nums.length+2];
        int n = 1;
        for (int x: nums)
        {
            if (x>0)
                temp[n++] = x;
            temp[0] = 1;
            temp[temp.length-1] = 1;
        }
    }
}
