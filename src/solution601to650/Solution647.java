package solution601to650;

/**
 * Created by Liu XZ on 2017/7/23.
 */
public class Solution647 {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String x = s.substring(i,j);
                if (isPalindromic(x))
                    result++;
            }
        }
        return result;
    }

    public boolean isPalindromic(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main (String[] args) {
        Solution647 s647 = new Solution647();
        String s = "abc";
        System.out.println(s647.countSubstrings(s));
    }
}
