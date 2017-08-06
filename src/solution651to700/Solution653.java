package solution651to700;

import Util.TreeNode;

import java.util.HashSet;

/**
 * Created by Liu XZ on 2017/8/6.
 */
public class Solution653 {
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);
    }

    public boolean helper (TreeNode root, int target) {
        if (root == null)
            return false;
        if (set.contains(target - root.val))
            return true;
        set.add(root.val);
        return helper(root.left, target) || helper(root.right, target);
    }
}
