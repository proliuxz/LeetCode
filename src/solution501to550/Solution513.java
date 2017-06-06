package solution501to550;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 3/6/2017.
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return 0;
        int tepResult = root.val;
        List nodes = new ArrayList();
        if (root.left!=null)
            nodes.add(root.left);
        if (root.right!=null)
            nodes.add(root.right);
        return find(nodes,tepResult);
    }
    int find(List<TreeNode> nodes, int tmpResult) {
        if (nodes.size()==0)
            return tmpResult;
        List nextLevelNodes = new ArrayList();
        int newTmpResult = nodes.get(0).val;
        for (TreeNode node: nodes
             ) {
            if (node.left!=null)
                nextLevelNodes.add(node.left);
            if (node.right!=null)
                nextLevelNodes.add(node.right);
        }
        return find(nextLevelNodes,newTmpResult);
    }
}
