package solution271to280;

/**
 * Created by Xinzhuo Liu on 11/29/2016.
 */
public class Solution280 {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if((i % 2 == 1 && nums[i] < nums[i-1]) || (i % 2 == 0 && nums[i] > nums[i-1])){
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
