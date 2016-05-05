package solution341to350;

import solution001to010.Solution2;

import java.util.*;

/**
 * Created by Liu Xinzhuo on 2016/5/4 0004.
 */
public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if(nums==null||k==0)
            return result;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for (int x : nums)
        {
            if (hashMap.get(x)==null)
                hashMap.put(x,1);
            else
                hashMap.put(x,hashMap.get(x)+1);
        }
        int[] array = new int[hashMap.size()];
        Iterator iterator = hashMap.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            HashMap.Entry pair =(Map.Entry) iterator.next();
            array[i] = (int) pair.getValue();
            temp.put((int)pair.getValue(),(int)pair.getKey());
            i++;
        }
        Arrays.sort(array);
        for (int j = 0; j < k ; j++)
        {
            result.add(temp.get(array[array.length-j-1]));
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2};
        int k = 2;
        Solution347 solution347 = new Solution347();
        System.out.println(solution347.topKFrequent(nums,k));
    }
}
