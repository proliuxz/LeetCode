package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/4/15 0015.
 */
public class Solution303 {
    int[] helper = null;
    public Solution303(int[] nums) {
        if (nums!=null&&nums.length!=0)
        {
            helper = new int[nums.length];
            helper[0] = nums[0];
            for (int i = 1; i <nums.length ; i++) {
                helper[i] = helper[i-1]+ nums[i];
            }
            for (int x : helper)
                System.out.println(x);
        }
    }

    public int sumRange(int i, int j) {
        if (helper==null||helper.length==0)
            return 0;
        if (i==0)
            return helper[j];
        return helper[j]-helper[i-1];
    }

    public static void main(String[] args)
    {
        int[] nums = {-2,0,3,-5,2,-1};
        Solution303 s303 = new Solution303(nums);

    }
}
