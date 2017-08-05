package solution601to650;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

 Example 1:
 Input:
 3
 / \
 9  20
 /  \
 15   7
 Output: [3, 14.5, 11]
 Explanation:
 The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 Note:
 The range of node's value is in the range of 32-bit signed integer.
 * Created by Liu XZ on 2017/7/10.
 */
public class Solution637 {
    List<Double> result = new ArrayList<Double>();
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> curr = new ArrayList<TreeNode>();
        curr.add(root);
        helper(curr);
        return result;
    }
    public void helper(List<TreeNode> curr) {
        List<TreeNode> next = new ArrayList<TreeNode>();
        if (curr.size()==0)
            return;
        else {
            double sum = 0;
            int num = 0;
            for (TreeNode root: curr
                 ) {
                sum += root.val;
                num++;
                if (root.left!=null)
                    next.add(root.left);
                if (root.right!=null)
                    next.add(root.right);
            }
            double avg = sum/num;
            result.add(avg);
            helper(next);
        }
    }

    public static void main(String[] args) {
        Solution637 solution637 = new Solution637();
        TreeNode node1 = new TreeNode(3);
    }
}
