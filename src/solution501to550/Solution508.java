package solution501to550;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Liu XZ on 2017/5/20.
 */
public class Solution508 {
    HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        int max = -1;
        findFrquestTreeSumHelper(root);
        for ( int key:hs.keySet()
             ) {
            max = Math.max(max,hs.get(key));
        }
        for ( int key:hs.keySet()
                ) {
            if (hs.get(key)==max)
                result.add(key);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private int findFrquestTreeSumHelper(TreeNode node) {
        if (node == null)
            return 0;
        int result = findFrquestTreeSumHelper(node.left) + findFrquestTreeSumHelper(node.right) + node.val;
        addToMap(result);
        return result;
    }

    private void addToMap(int x) {
        if (hs.containsKey(x))
            hs.put(x,(hs.get(x)+1));
        else
            hs.put(x,1);
    }
}
