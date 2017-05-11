package solution151to200;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Xinzhuo Liu on 12/15/2016.
 */
public class Solution170 {
    HashSet<Integer> nums = new HashSet<>();
    HashSet<Integer> pairs = new HashSet<>();

    public void add(int number) {
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext())
        {
            pairs.add(iterator.next()+number);
        }
        nums.add(number);
    }

    public boolean find(int value) {
        return pairs.contains(value);
    }
}
