package solution301to350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/5/21 0021.
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result =new ArrayList<Integer>();
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i <nums1.length ; i++) {
            if (hashMap.containsKey(nums1[i]))
            {
                hashMap.put(nums1[i],hashMap.get(nums1[i])+1);
            }
            else
                hashMap.put(nums1[i],1);
        }
        for (int i = 0; i <nums2.length ; i++) {
            if (hashMap.containsKey(nums2[i]))
            {
                result.add(nums2[i]);
                int count = hashMap.get(nums2[i]);
                if (count>1)
                    hashMap.put(nums2[i],count-1);
                else
                    hashMap.remove(nums2[i]);
            }
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    public static void main(String[] args)
    {
        Solution350 solution350 = new Solution350();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        Util.Show.showArray(solution350.intersect(nums1,nums2));
    }
}
