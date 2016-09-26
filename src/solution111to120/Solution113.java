package solution111to120;

import Util.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/5/20 0020.
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 Subscribe to see which companies asked this question
 */
public class Solution113 {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            dfs(root,new ArrayList<>(),sum);
            return res;
        }
        private void dfs(TreeNode root ,List<Integer> curList,int sum){
            if(root == null) return;
            curList.add(root.val);
            if(root.left == null && root.right == null){
                if(sum == root.val){
                    res.add(new ArrayList<>(curList));
                }
                curList.remove(curList.size()-1);
                return;
            }
            dfs(root.left,curList,sum - root.val);
            dfs(root.right,curList,sum - root.val);
            curList.remove(curList.size()-1);
        }
//    public static void  main(String[] args)
//    {
//        Solution113 solution113 = new Solution113();
//        TreeNode treeNode1 = new TreeNode(5);
//        TreeNode treeNode2 = new TreeNode(4);
//        TreeNode treeNode3 = new TreeNode(8);
//        TreeNode treeNode4 = new TreeNode(11);
//        TreeNode treeNode5 = new TreeNode(13);
//        TreeNode treeNode6 = new TreeNode(4);
//        TreeNode treeNode7 = new TreeNode(7);
//        TreeNode treeNode8 = new TreeNode(2);
//        TreeNode treeNode9 = new TreeNode(5);
//        TreeNode treeNode10= new TreeNode(1);
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode4.left = treeNode7;
//        treeNode4.right = treeNode8;
//        treeNode3.left = treeNode5;
//        treeNode3.right = treeNode6;
//        treeNode6.left = treeNode9;
//        treeNode6.right = treeNode10;
//
//        int sum = 22;
//
//        solution113.pathSum(treeNode1,22);
//    }
}
