package solution341to350;

import java.util.regex.Pattern;

/**
 * Created by Liu Xinzhuo on 2016/4/24 0024.
 */
public class Solution345 {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int r = c.length-1;
        while(l < r)
        {
            while (!val(c[l])&&l<r)
            {
                l++;
            }
            while (!val(c[r])&&l<r)
            {
                r--;
            }
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);
    }
    public boolean val(char c)
    {
        if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
            return true;
        else
            return false;
    }
}
