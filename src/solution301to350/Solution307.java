package solution301to350;

/**
 * Created by Liu Xinzhuo on 2015/11/22.
 */
public class Solution307 {

    int nums[] = null;
    int sums[] = null;

    public Solution307(int[] nums) {
        this.nums = nums;
        this.sums = new int[nums.length];
        updateSums();
    }

    public void updateSums()
    {
        if (nums.length!=0)
        {
            sums[0] = nums[0];
            for (int i = 1; i < sums.length ; i++)
            {
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public void updateSums(int i, int j)
    {
        if (nums.length!=0)
        {
            int x = j - nums[i];
            for (int pos = i; pos < sums.length ; pos++)
            {
                sums[pos] += sums[pos]+x;
            }
        }
    }

    void update(int i, int val) {
        nums[i] = val;
        updateSums();
    }

    public int sumRange(int i, int j) {
        if (sums.length==0)
            return 0;
        return i==0?sums[j]:sums[j]-sums[i-1];
    }
    public static void main(String[] args)
    {
        int nums[]={};
        Solution307 s307 = new Solution307(nums);
        System.out.println(s307.sumRange(0,6));
        s307.update(0,0);
        System.out.println(s307.sumRange(0, 6));
    }
}
