package solution351to400;

import static Util.Show.showArray;

/**
 * Created by Xinzhuo Liu on 12/5/2016.
 * <p>
 * 370. Range Addition   Add to List QuestionEditorial Solution  My Submissions
 * Total Accepted: 6877
 * Total Submissions: 13038
 * Difficulty: Medium
 * Contributors: Admin
 * Assume you have an array of length n initialized with all 0's and are given k update operations.
 * <p>
 * Each operation is represented as a triplet: [startIndex, endIndex, inc] which increments each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.
 * <p>
 * Return the modified array after all k operations were executed.
 * <p>
 * Example:
 * <p>
 * Given:
 * <p>
 * length = 5,
 * updates = [
 * [1,  3,  2],
 * [2,  4,  3],
 * [0,  2, -2]
 * ]
 * <p>
 * Output:
 * <p>
 * [-2, 0, 3, 5, 3]
 * Explanation:
 * <p>
 * Initial state:
 * [ 0, 0, 0, 0, 0 ]
 * <p>
 * After applying operation [1, 3, 2]:
 * [ 0, 2, 2, 2, 0 ]
 * <p>
 * After applying operation [2, 4, 3]:
 * [ 0, 2, 5, 5, 3 ]
 * <p>
 * After applying operation [0, 2, -2]:
 * [-2, 0, 3, 5, 3 ]
 */
public class Solution370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for (int[] update : updates
                ) {
            result[update[0]] += update[2];
            if (update[1] + 1 < length)
                result[update[1] + 1] -= update[2];
        }
        for (int i = 1; i < result.length; i++) {
            result[i] += result[i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution370 s370 = new Solution370();
        int length = 5;
        int[][] updates = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
        showArray(s370.getModifiedArray(length,updates));
    }
}
