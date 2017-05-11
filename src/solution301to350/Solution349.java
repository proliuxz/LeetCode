package solution301to350;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/5/18 0018.
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        HashSet<Integer> duplicate = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int num1 : nums1)
            hashSet1.add(num1);
        for (int num2 : nums2)
        {
            if (hashSet1.contains(num2)&&(!duplicate.contains(num2)))
            {
                result.add(num2);
                duplicate.add(num2);
            }
        }
        int[] arrResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(i);
        }
        return arrResult;
    }
}
