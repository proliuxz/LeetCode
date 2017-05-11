package solution251to300;

/**
 * Created by Xinzhuo Liu on 12/9/2016.
 *
 * There is a fence with n posts, each post can be painted with one of the k colors.

 You have to paint all the posts such that no more than two adjacent fence posts have the same color.

 Return the total number of ways you can paint the fence.

 Note:
 n and k are non-negative integers.
 */
public class Solution276 {
    public int numWays(int n, int k) {
        if ((n == 0 || k == 0) || (k == 1 && n >= 3))
            return 0;
        int left = k;
        int mid = k * k;
        int right;
        if (n == 1)
            return left;
        if (n == 2)
            return mid;
        for (int i = 0; i <= n - 3; i++) {
            right = (k - 1) * (left + mid);
            left = mid;
            mid = right;
        }
        return mid;
    }
}
