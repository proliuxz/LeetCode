package solution351to400;

import java.util.HashSet;
import java.util.Random;

public class Solution380 {
    HashSet<Integer> set;
    Random random;
    public Solution380() {
        set = new HashSet<Integer>();
        random = new Random();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int index = random.nextInt(set.size());
        return (int) set.toArray()[index];
    }
}
