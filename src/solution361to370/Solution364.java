package solution361to370;

import Util.NestedInteger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution364 {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        List<Integer> result = dfs(nestedList, 0, new ArrayList<>());
        int total = 0;
        for (int index = result.size() - 1; index >= 0; index--) {
            total += result.get(index) * (result.size() - index);
        }
        return total;
    }

    List<Integer> dfs(Iterable<NestedInteger> list, int depth, List<Integer> result) {
        if (depth == result.size()) {
            result.add(0);
        }
        for (NestedInteger integer : list) {
            if (integer.isInteger()) {
                result.set(depth, result.get(depth) + integer.getInteger());
            } else {
                dfs(integer.getList(), depth + 1, result);
            }
        }
        return result;
    }
}
