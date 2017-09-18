package solution401to450;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution449 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur==null)
                sb.append("#,");
            else {
                sb.append(cur.val);
                sb.append(",");
                if (cur.left != null || cur.right != null) {
                    queue.add(cur.left);
                    queue.add(cur.right);
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int start = 1;
        int pos = 0;
        return null;
    }

    private TreeNode getTreeNode(String num) {
        if (num=="#")
            return null;
        return new TreeNode(Integer.parseInt(num));
    }

    public static void main(String[] args) {
        Solution449 s449 = new Solution449();
        TreeNode tr1 = new TreeNode(1);
        TreeNode tr2 = new TreeNode(2);
        TreeNode tr3 = new TreeNode(3);
        TreeNode tr4 = new TreeNode(4);
        TreeNode tr5 = new TreeNode(5);
        TreeNode tr6 = new TreeNode(6);
        tr1.left = tr2;
        tr1.right = tr3;
        tr2.left = tr4;
        tr2.right = tr5;
        tr3.right = tr6;
        String s = s449.serialize(tr1);

        s449.deserialize(s);
    }
}
