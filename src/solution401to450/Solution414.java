package solution401to450;

import java.util.TreeSet;

/**
 * Created by Xinzhuo Liu on 12/14/2016.
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for (int num : nums
                ) {
            set.add(num);
        }
        Object[] tmp = set.toArray();
        return set.size() > 2 ? (int) tmp[tmp.length - 3] : (int) tmp[tmp.length - 1];
    }

    public static void main(String[] args) {
        Solution414 s414 = new Solution414();
        int[] nums = {3, 2, 1};
        System.out.println(s414.thirdMax(nums));
    }
}
