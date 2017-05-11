package solution251to300;

import java.util.HashMap;

/**
 * Created by Liu Xinzhuo on 2016/4/15 0015.
 */
public class Solution290 {
    public boolean wordPattern(String pattern, String str)
    {
        HashMap<Character,String> hashMap = new HashMap<Character,String>();
        String[] s = str.split(" ");
        if (pattern.length()!=s.length)
            return false;
        for (int i = 0; i <pattern.length() ; i++)
        {
            if (!hashMap.containsKey(pattern.charAt(i)))
            {
                if (hashMap.containsValue(s[i]))
                    return false;
                hashMap.put(pattern.charAt(i),s[i]);
            }
            else if (!hashMap.get(pattern.charAt(i)).equals(s[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String pattern = "abba";
        String str = "dog dog dog dog";
        Solution290 s290 = new Solution290();
        System.out.println(s290.wordPattern(pattern,str));
    }
}
