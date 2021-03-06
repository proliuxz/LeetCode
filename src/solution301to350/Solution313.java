package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/4/28 0028.
 * Write a program to find the nth super ugly number.

 Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.

 Note:
 (1) 1 is a super ugly number for any given primes.
 (2) The given numbers in primes are in ascending order.
 (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.

 Credits:
 Special thanks to @dietpepsi for adding this problem and creating all test cases.

 Subscribe to see which companies asked this question
 */
public class Solution313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int q[] = new int[n];
        int idx[] = new int[len];
        int vals[] = new int[len];
        q[0] = 1;
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < len; j++)
            {
                vals[j] = q[idx[j]] * primes[j];
            }

            q[i] = findMin(vals);
            for (int j = 0; j < len; j++)
            {
                if (vals[j] == q[i])
                {
                    idx[j] += 1;
                }
            }
        }
        return q[n - 1];
    }
    public int findMin(int[] nums)
    {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
