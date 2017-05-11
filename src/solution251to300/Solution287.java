package solution251to300;

/**
 * Created by Liu Xinzhuo on 2015/12/20.
 */
public class Solution287 {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        for (int i = 0 ; i <len ; i ++)
        {
            if (nums[i] == i+1)
                continue;;
            int oIndex = i;
            int nIndex = nums[i] - 1;
            while (nums[oIndex] != oIndex+1)
            {
                if (nums[oIndex] == nums[nIndex])
                    return nums[oIndex];
                int temp = nums[nIndex];
                nums[nIndex] = nums[oIndex];
                nums[oIndex] = temp;
                nIndex = nums[oIndex] - 1;
            }
        }
        return 0;
    }
}
