package solution341to350;

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
        TreeSet<NumsSet> treeSet = new TreeSet<NumsSet>(new NumsSet.TeacherCompare());

        for (int x : nums)
        {
            if (hashMap.get(x)==null)
                hashMap.put(x,1);
            else
                hashMap.put(x,hashMap.get(x)+1);
        }

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext())
        {
            HashMap.Entry pair =(Map.Entry) iterator.next();
            NumsSet numsSet = new NumsSet((int)pair.getKey(),(int)pair.getValue());
            treeSet.add(numsSet);
        }

        Iterator iterator1 = treeSet.iterator();
        while(k-->0)
        {
            NumsSet numsSet = (NumsSet) iterator1.next();
            result.add(numsSet.num);
        }

        return result;
    }

    public static class NumsSet
    {
        int num;
        int qty;
        NumsSet(int num, int qty)
        {
            this.num = num;
            this.qty = qty;
        }
        public static class TeacherCompare implements Comparator
        {
            public int compare(Object o1, Object o2) {
                NumsSet s1 = (NumsSet) o1;
                NumsSet s2 = (NumsSet) o2;
                int result = s1.qty > s2.qty ?-1: 1;
                return result;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        Solution347 solution347 = new Solution347();
        System.out.println(solution347.topKFrequent(nums,k));
    }
}
