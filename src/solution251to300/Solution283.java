package solution251to300;


/**
 * Created by Liu Xinzhuo on 2015/9/19.
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class Solution283 {
    public void moveZeroes(int[] nums)
    {
        if(nums.length==0||nums==null)
            return;
        int nonOfZero = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if (nums[i]!=0)
            {
                swap(i,nonOfZero,nums);
                nonOfZero++;
            }
        }
    }

    public void swap(int i, int j , int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args)
    {
        Solution283 s283 = new Solution283();
        int[] nums = {0,1,0,3,12};
        s283.moveZeroes(nums);
        for (int x : nums)
        {
            System.out.println(x);
        }
    }
}
