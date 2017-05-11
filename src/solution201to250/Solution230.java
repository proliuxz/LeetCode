package solution201to250;
import Util.TreeNode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Liu Xinzhuo on 2015/12/20.
 */
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int result = 0;
        while(!stack.isEmpty() || p!=null)
        {
            if(p!=null)
            {
                stack.push(p);
                p = p.left;
            }else
            {
                TreeNode t = stack.pop();
                k--;
                if(k==0)
                    result = t.val;
                p = t.right;
            }
        }
        return result;
    }
}
