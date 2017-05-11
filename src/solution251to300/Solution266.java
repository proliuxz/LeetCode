package solution251to300;

import java.util.HashSet;

/**
 * Created by Xinzhuo Liu on 11/28/2016.
 */
public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); ++i){
            if (!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else
                set.remove(s.charAt(i));
        }
        return set.size()==0 || set.size()==1;
    }
}
