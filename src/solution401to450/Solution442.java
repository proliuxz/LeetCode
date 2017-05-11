package solution401to450;

import java.util.ArrayList;
import java.util.List;

import static Util.Show.showArray;
import static Util.Show.showListInt;

/**
 * Created by Xinzhuo Liu on 3/10/2017.
 * 42. Find All Duplicates in an Array Add to List
 * DescriptionSubmissionsSolutions
 * Total Accepted: 19921
 * Total Submissions: 37951
 * Difficulty: Medium
 * Contributors: shen5630
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 * Show Company Tags
 * Show Tags
 * Show Similar Problems
 */
public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++)
            nums[(nums[i] - 1) % n] += n;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 2 * n)
                res.add(i + 1);
        showArray(nums);
        showListInt(res);
        return res;
    }
    public static void main(String[] args){
        Solution442 s442 = new Solution442();
        int[] nums = {1};
        s442.findDuplicates(nums);
    }
}
