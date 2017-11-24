package solution251to300;

import java.util.Iterator;
import java.util.List;

public class Solution251 {
    private Iterator<List<Integer>> listIterator;
    private Iterator<Integer> nums;

    public Solution251(List<List<Integer>> vec2d) {
        listIterator = vec2d.iterator();
    }

    public Integer next() {
        hasNext();
        return nums.next();
    }

    public boolean hasNext() {
        while (nums == null || !nums.hasNext() && listIterator.hasNext())
            nums = listIterator.next().iterator();
        return nums!=null && nums.hasNext();
    }
}
