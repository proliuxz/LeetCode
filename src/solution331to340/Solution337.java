package solution331to340;

import Util.TreeNode;


/**
 * Created by Liu Xinzhuo on 2016/3/23 0023.
 */
public class Solution337 {
    public int rob(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return root.val;
        return dfs(root)[0];
    }
    public int[] dfs(TreeNode root) {
        int dp[]={0,0};
        if(root != null){
            int[] dp_L = dfs(root.left);
            int[] dp_R = dfs(root.right);
            dp[1] = dp_L[0] + dp_R[0];
            dp[0] = Math.max(dp[1] ,dp_L[1] + dp_R[1] + root.val);
        }
        return dp;
    }


    public TreeNode getNode(int i) {
        return i==0? null: new TreeNode(i);
    }
    public static void main(String[] args)
    {
        Solution337 s337 = new Solution337();
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node2.right = node5;
        System.out.println(s337.rob(node1));
    }
}
