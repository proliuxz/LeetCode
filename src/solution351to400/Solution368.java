package solution351to400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            tmp.add(nums[i]);
            for (int j = i+1; j <nums.length ; j++) {
                boolean flag = true;
                for (int num: tmp
                        ) {
                    if (num%nums[j]!=0&&nums[i]%num!=0)
                        flag = false;
                }
                if (flag == true)
                    tmp.add(nums[j]);
            }
            if (tmp.size()>res.size())
            {
                res.clear();
                res.addAll(tmp);
            }
            tmp.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution368 s368 = new Solution368();
        List<Integer> res = s368.largestDivisibleSubset(nums);
    }
}
