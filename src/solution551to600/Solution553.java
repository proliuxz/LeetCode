package solution551to600;

/**
 * Created by Xinzhuo Liu on 5/11/2017.
 */
public class Solution553 {
    public String optimalDivision(int[] nums) {
        if (nums.length==0)
            return "";
        if (nums.length==1)
            return Integer.toString(nums[0]);
        if (nums.length==2)
            return nums[0]+"/"+nums[1];
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]+"/(");
        for (int i = 1; i < nums.length; i++) {
            sb.append(+nums[i]);
            if (i!=nums.length-1){
                sb.append("/");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
