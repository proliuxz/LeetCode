package solution201to250;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 12/3/2016.
 */
public class Solution246 {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> hm = new HashMap();
        hm.put('0', '0');
        hm.put('1', '1');
        hm.put('6', '9');
        hm.put('8', '8');
        hm.put('9', '6');
        int len = num.length();
        for (int i = 0; i < num.length(); i++) {
            if (!hm.containsKey(num.charAt(i)) || (hm.get(num.charAt(i))!=num.charAt(len-1-i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution246 s246 = new Solution246();
        System.out.println(s246.isStrobogrammatic("69"));
    }
}
