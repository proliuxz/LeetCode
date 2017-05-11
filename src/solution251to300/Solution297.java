package solution251to300;

import Util.TreeNode;

/**
 * Created by Liu Xinzhuo on 2016/5/23 0023.
 */
public class Solution297 {
    public String serialize(TreeNode root) {
        if (root==null)
            return null;
        String result = new String();
        char[] layer = new char[1];
        serializeHelper(root,result);
        return result;
    }

    public String serializeHelper(TreeNode root, String result)
    {
        return null;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
    public static void main(String[] args)
    {
        Solution297 solution297 = new Solution297();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(solution297.serialize(treeNode1));
    }
}
