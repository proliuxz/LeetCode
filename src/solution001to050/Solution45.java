package solution001to050;

/**
 * Created by Liu Xinzhuo on 2016/5/23 0023.
 */
public class Solution45 {
    public int jump(int[] nums) {
        int result = 0;
        int last = 0;
        int cur = 0;
        for (int i = 0; i <nums.length ; i++)
        {
            if (i>cur)
                return -1;
            if (i > last)
            {
                last = cur;
                result++;
            }
            cur = Math.max(cur,i+nums[i]);
        }
        return result;
    }
}
