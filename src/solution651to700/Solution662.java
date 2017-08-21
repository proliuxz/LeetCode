package solution651to700;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu.xinzhou on 21/8/2017.
 */
public class Solution662 {
    public int widthOfBinaryTree(TreeNode root) {
        return dfs(root,1,1,new ArrayList<Integer>(),new ArrayList<Integer>());
    }

    public int dfs(TreeNode root, int level, int order, List<Integer> start, List<Integer> end){
        if (root==null)
            return 0;
        if(start.size() == level){
            start.add(order);
            end.add(order);
        }
        else
            end.set(level, order);
        int cur = end.get(level) - start.get(level) + 1;
        int left = dfs(root.left, level + 1, 2*order, start, end);
        int right = dfs(root.right, level + 1, 2*order + 1, start, end);
        return Math.max(cur, Math.max(left, right));
    }


    public static void main(String[] args) {
        Solution662 s662 = new Solution662();
        TreeNode tr1 = new TreeNode(3);
        TreeNode tr2 = new TreeNode(2);
        TreeNode tr3 = new TreeNode(4);
        TreeNode tr4 = new TreeNode(1);
        tr1.left = tr2;
        tr1.right = tr3;
        tr3.left = tr4;
        int res = s662.widthOfBinaryTree(tr1);
        System.out.println(res);
    }
}
