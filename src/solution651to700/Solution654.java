package solution651to700;

import Util.TreeNode;

/**
 * Created by Liu XZ on 2017/8/6.
 */
public class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructHelper(nums, 0, nums.length);
    }

    public TreeNode constructHelper(int[] nums,int left, int right) {
        if (left == right)
            return null;
        int maxIdx = findMax(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = constructHelper(nums,left,maxIdx);
        root.right = constructHelper(nums,maxIdx+1,right);
        return root;
    }

    public int findMax(int[] nums, int left, int right) {
        int max_i = left;
        for (int i = left; i < right; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
