package solution301to310;

/**
 * Created by Liu Xinzhuo on 2015/11/22.
 */
public class Solution307 {

    int nums[]=null;
    public Solution307(int[] nums) {
        this.nums=nums;
    }

    void update(int i, int val) {
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        int sum=0;
        for (int k=i; k<=j;k++)
            sum+=nums[k];
        return sum;
    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5,6,7};
        Solution307 s307 = new Solution307(nums);
        System.out.println(s307.sumRange(0,6));
        s307.update(1, 5);
        System.out.println(s307.sumRange(0, 6));
    }
}
