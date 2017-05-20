package solution501to550;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 3/10/2017.
 */
public class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        List result = new ArrayList<Integer>();
        if (root == null)
            return result;
        List nextLevel = new ArrayList<TreeNode>();
        result.add(root.val);
        if (root.left != null)
            nextLevel.add(root.left);
        if (root.right != null)
            nextLevel.add(root.right);
        return largestValuesHelper(result, nextLevel);
    }

    public List<Integer> largestValuesHelper(List<Integer> result, List<TreeNode> level) {
        if (level.size()==0)
            return result;
        int max = Integer.MIN_VALUE;
        List nextLevel = new ArrayList<TreeNode>();
        for (TreeNode node: level
             ) {
            max = Math.max(max, node.val);
            if (node.left != null)
                nextLevel.add(node.left);
            if (node.right != null)
                nextLevel.add(node.right);
        }
        result.add(max);
        return nextLevel.size()==0?result:largestValuesHelper(result, nextLevel);
    }
}
