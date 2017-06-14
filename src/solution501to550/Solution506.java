package solution501to550;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by liu.xinzhou on 6/6/2017.
 */
public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        int[] ranks = nums.clone();
        Arrays.sort(ranks);

        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < ranks.length ; i++) {
            hashMap.put(ranks[i],nums.length - i);
        }

        String[] result = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            int rank = hashMap.get(nums[i]);
            String rankStr = rank+"";
            if(rank==1) rankStr = "Gold Medal";
            else if(rank==2) rankStr = "Silver Medal";
            else if(rank==3) rankStr = "Bronze Medal";
            result[i] = rankStr;
        }
        return result;
    }
}
