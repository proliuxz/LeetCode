package solution251to300;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/16 0016.
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * For example, given the following binary tree:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * All root-to-leaf paths are:
 * <p>
 * ["1->2->5", "1->3"]
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return new ArrayList<String>();
        else if (root.left == null && root.right == null) {
            List result = new ArrayList<String>();
            result.add(Integer.toString(root.val));
            return result;
        } else
            return binaryTreePathsHelper(Integer.toString(root.val), root);
    }

    public List<String> binaryTreePathsHelper(String rootString, TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root.left == null && root.right == null) {
            result.add(rootString);
            return result;
        }
        if (root.left != null)
            result.addAll(binaryTreePathsHelper(rootString + "->" + root.left.val, root.left));
        if (root.right != null)
            result.addAll(binaryTreePathsHelper(rootString + "->" + root.right.val, root.right));
        return result;
    }
}
