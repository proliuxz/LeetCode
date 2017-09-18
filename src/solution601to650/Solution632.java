package solution601to650;

import java.util.*;

public class Solution632 {
    List<Pair> list = new ArrayList<Pair>();
    public int[] smallestRange(List<List<Integer>> nums) {
        for (int i = 0; i <nums.size() ; i++) {
            for (int num: nums.get(i)
                 ) {
                list.add(new Pair(num,i));
            }
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.a-o2.a;
            }
        });


        return null;
    }
}

class Pair {
    public int a;
    public int b;
    Pair(int a,int b) {
        this.a = a;
        this.b = b;
    }
}
