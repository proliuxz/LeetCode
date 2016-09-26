package solution101to110;

import Util.TreeNode;

import java.util.*;

/**
 * Created by Liu Xinzhuo on 2016/5/18 0018.
 */
public class Solution103
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)
            return result;
        List thisLayer = new ArrayList<>();
        thisLayer.add(root);
        zigHelper(result,thisLayer,1);
        return result;
    }

    public void zigHelper(List<List<Integer>> result,List<TreeNode> layer,int layerNum)
    {
        List<TreeNode> children = null;
        List<Integer> nums = new ArrayList<>();
        if (layer!=null&&layer.size()!=0)
        {
            children = new ArrayList<>();
            for (TreeNode node: layer)
            {
                nums.add(node.val);
                if (node.left!=null)
                    children.add(node.left);
                if (node.right!=null)
                    children.add(node.right);
            }
        }
        if (layerNum%2==0)
            Collections.reverse(nums);
        if (nums.size()!=0)
            result.add(nums);
        if (children!=null)
            zigHelper(result,children,layerNum+1);
    }
}
