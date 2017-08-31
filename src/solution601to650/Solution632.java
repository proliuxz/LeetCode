package solution601to650;

import java.util.List;

public class Solution632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] index = new int[nums.size()];
        int[] maxIndex = new int[nums.size()];
        for (int i = 0; i <nums.size() ; i++) {
            maxIndex[i] = nums.get(i).size();
        }
        return null;
    }

    private int[] getRange(int[] nums) {
        if (nums == null || nums.length==0)
            return new int[] {0,0};
        else {
            int min = nums[0];
            int max = nums[0];
            for (int num: nums
                 ) {
                min = Math.min(min,num);
                max = Math.max(max,num);
            }
            return new int[] {min,max};
        }
    }
}
