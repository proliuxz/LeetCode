package solution311to320;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/26 0026.
 */
public class Solution315 {
    class Node
    {
        int count; // number of values <= this.val
        int val;
        int dup; // duplication of same value
        Node left, right;

        public Node(int val)
        {
            this.val = val;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = min < nums[i] ? min : nums[i];
            max = max > nums[i] ? max : nums[i];
        }
        int mid = (max - min) / 2;
        Node root = new Node(mid);

        for (int i = nums.length - 1; i >= 0; i--) {
            insert(root, list, nums[i], 0);
        }
        return list;
    }
    public Node insert(Node root, LinkedList<Integer> list, int val, int sum) {
        if (root == null) {
            list.addFirst(sum);
            Node cur = new Node(val);
            cur.dup = 1;
            cur.count = 1;
            return cur;
        }

        if (val < root.val) {
            root.left = insert(root.left, list, val, sum);
            root.count += 1;
        } else if (val == root.val) {
            sum += root.count - root.dup;
            list.addFirst(sum);
            root.dup += 1;
            root.count += 1;
        } else {
            sum += root.count;
            root.right = insert(root.right, list, val, sum);
        }

        return root;
    }


    public static  void main(String[] arg)
    {
        int[] nums = {5,2,6,1};
        Solution315 solution315 = new Solution315();
        solution315.countSmaller(nums);
    }
}
