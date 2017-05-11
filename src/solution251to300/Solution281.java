package solution251to300;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/6/2016.
 */
public class Solution281 {
    private Iterator<Integer> i, j, tmp;
    List<Integer> numbers = new ArrayList<>();

    public Solution281(List<Integer> v1, List<Integer> v2) {
        i = v2.iterator();
        j = v1.iterator();
    }

    public int next() {
        if (j.hasNext()) {
            tmp = j;
            j = i;
            i = tmp;
        }
        return i.next();
    }

    public boolean hasNext() {
        return i.hasNext() || j.hasNext();
    }
}
