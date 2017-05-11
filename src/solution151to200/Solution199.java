package solution151to200;
import Util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Liu Xinzhuo on 2016/3/9 0009.
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 For example:
 Given the following binary tree,
 1            <---
 /   \
 2     3         <---
 \     \
 5     4       <---
 You should return [1, 3, 4].
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.pollFirst();

            if (node == null)
            {
                if (queue.isEmpty())
                {
                    break;
                }
                else
                {
                    queue.add(null);
                }
            }
            else
            {
                // add the rightest to the answer
                if (queue.peek() == null)
                {
                    result.add(node.val);
                }

                if (node.left != null)
                {
                    queue.add(node.left);
                }

                if (node.right != null)
                {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }
}
