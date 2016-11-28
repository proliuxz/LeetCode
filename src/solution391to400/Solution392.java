package solution391to400;

/**
 * Created by Xinzhuo on 2016/10/14 0014.
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t)
    {
        int i = 0;
        int j = 0;
        while (i<s.length()&&j<t.length())
        {
            if (s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        return  (i==s.length())?true:false;
    }
}
