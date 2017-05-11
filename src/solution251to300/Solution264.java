package solution251to300;

/**
 * Created by Liu Xinzhuo on 2016/4/26 0026.
 * 264. Ugly Number II   My Submissions QuestionEditorial Solution
 Total Accepted: 28694 Total Submissions: 102909 Difficulty: Medium
 Write a program to find the n-th ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

 Note that 1 is typically treated as an ugly number.

 Show Hint

 */
public class Solution264 {
    public int nthUglyNumber(int n) {
        int[] resultSet = new int[n];
        resultSet[0] = 1;
        int n2 = 0, n3 = 0, n5 = 0;
        for (int i =1;i<n;i++)
        {
            int next = Math.min(resultSet[n2]*2, Math.min(resultSet[n3]*3,resultSet[n5]*5));
            if(resultSet[n2]*2 == next) {
                resultSet[i] = resultSet[n2]*2;
                n2 ++;
            }
            if(resultSet[n3]*3 == next) {
                resultSet[i] = resultSet[n3]*3;
                n3 ++;
            }
            if(resultSet[n5]*5 == next) {
                resultSet[i] = resultSet[n5]*5;
                n5 ++;
            }
        }
        return resultSet[n-1];
    }

    public static void main(String [] args)
    {
        Solution264 solution264 = new Solution264();
        System.out.println(solution264.nthUglyNumber(1));
    }
}
