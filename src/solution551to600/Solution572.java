package solution551to600;

import Util.TreeNode;

/**
 * Created by liu.xinzhou on 9/6/2017.
 */
public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null && t!=null)
            return false;
        else if (s==null && t == null)
            return true;
        if (isSameTree(s,t))
            return true;
        else if (s.left!=null && isSubtree(s.left,t)) {
            return true;
        }
        else if (s.right!=null && isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }

    private boolean isSameTree (TreeNode a, TreeNode b)
    {
        int a1 = detectTree(a);
        int b1 = detectTree(b);
        if (a1!=b1 || a.val!=b.val)
            return false;
        else {
            switch (a1) {
                case 0: {return  true;}
                case 1: {return isSameTree(a.left,b.left); }
                case 2: {return isSameTree(a.right,b.right); }
                case 3: {return isSameTree(a.left,b.left) && isSameTree(a.right,b.right); }
            }
        }
        return false;
    }

    private int detectTree (TreeNode node) {
        if (node == null)
            return -1;
        int result = 0;
        if (node.left!=null)
            result += 1;
        if (node.right!=null)
            result += 2;
        return result;
    }

    public static void main (String[] args) {
        Solution572 s572 = new Solution572();
        TreeNode tra1 = new TreeNode(1);
        TreeNode tra2 = new TreeNode(1);
        TreeNode tra3 = new TreeNode(1);
        TreeNode tra4 = new TreeNode(1);
        TreeNode tra5 = new TreeNode(1);
        TreeNode tra6 = new TreeNode(1);
        TreeNode tra7 = new TreeNode(1);
        TreeNode tra8 = new TreeNode(1);
        TreeNode tra9 = new TreeNode(1);
        TreeNode tra10 = new TreeNode(1);
        TreeNode tra11 = new TreeNode(1);
        TreeNode tra12 = new TreeNode(2);
        tra1.right = tra2;
        tra2.right = tra3;
        tra3.right = tra4;
        tra4.right = tra5;
        tra5.right = tra6;
        tra6.right = tra7;
        tra7.right = tra8;
        tra8.right = tra9;
        tra9.right = tra10;
        tra10.left = tra11;
        tra10.right = tra12;

        TreeNode trb1 = new TreeNode(1);
        TreeNode trb2 = new TreeNode(1);
        TreeNode trb3 = new TreeNode(1);
        TreeNode trb4 = new TreeNode(1);
        TreeNode trb5 = new TreeNode(1);
        TreeNode trb6 = new TreeNode(1);
        TreeNode trb7 = new TreeNode(2);
        trb1.right = trb2;
        trb2.right = trb3;
        trb3.right = trb4;
        trb4.right = trb5;
        trb5.left = trb6;
        trb5.right = trb7;
        System.out.println(s572.isSubtree(tra1,trb1));
    }
}
