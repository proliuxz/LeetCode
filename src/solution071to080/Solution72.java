package solution071to080;

/**
 * Created by Liu Xinzhuo on 2016/5/27 0027.
 *
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

 You have the following 3 operations permitted on a word:

 a) Insert a character
 b) Delete a character
 c) Replace a character
 */
public class Solution72 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];

        for (int i = 0; i <= len2 ; i++) {
            dp[0][i] = i;
        }

        for (int i = 0; i <= len1 ; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <len1 ; i++) {
            for (int j = 0; j <len2 ; j++) {
                int cost = 1;
                if (word1.charAt(i)==word2.charAt(j))
                    cost = 0;
                int minVal = Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i+1][j+1] = dp[i][j]+cost;
                if (dp[i][j]>minVal)
                    dp[i+1][j+1] = minVal+1;
            }
        }
        return dp[len1][len2];
    }
    public static void main(String[] args)
    {
        Solution72 solution72 = new Solution72();
        String word1 = "abcdefghijklmno";
        String word2 = "adgetmnpo";
        System.out.println(solution72.minDistance(word1,word2));
    }
}
