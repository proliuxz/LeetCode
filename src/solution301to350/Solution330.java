package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/5/18 0018.
 */
public class Solution330 {
    public int minPatches(int[] nums, int n)
    {
        int result = 0;
        int index = 0;
        // currSum标记了当前数组nums可累加到的最大范围[1, currSum)
        for (double currSum = 1; currSum <= n; )
        {
            // 数组内元素小于currSum时，可累加的sum上限增加为// currSum + nums[index]，然后数组索引值加1
            if (index < nums.length && nums[index] <= currSum)
                currSum += nums[index++];
            else
            {
                currSum *= 2; // 添入元素后，可累加的sum范围加倍
                ++result;
            }
        }
    return result;
    }
    public static void main(String[] args)
    {
        Solution330 solution330 = new Solution330();
        int[] nums = {1,2,31,33};
        int n = 2147483647;
        System.out.println(solution330.minPatches(nums,n));
    }
}
