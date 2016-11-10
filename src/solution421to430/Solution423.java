package solution421to430;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 10/20/2016.
 * Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.

 Note:
 Input contains only lowercase English letters.
 Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
 Input length is less than 50,000.
 Example 1:
 Input: "owoztneoer"

 Output: "012"
 Example 2:
 Input: "fviefuro"

 Output: "45"
 */
public class Solution423 {
    public String originalDigits(String s) {
        int[] tempResult = new int[10];
        HashMap<Character,Integer> hm = new HashMap();
        char[] letters = {'g','h','n','o','s','u','v','w','x','z'};
        for (char x: letters
             ) {
            hm.put(x,0);
        }
        int[] num = new int[8];
        for (int i = 0; i <s.length() ; i++) {
            if (hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        tempResult[0] = hm.get('z');
        tempResult[2] = hm.get('w');
        tempResult[4] = hm.get('u');
        tempResult[6] = hm.get('x');
        tempResult[8] = hm.get('g');
        tempResult[7] = hm.get('s') - tempResult[6];
        tempResult[3] = hm.get('h') - tempResult[8];
        tempResult[5] = hm.get('v') - tempResult[7];
        tempResult[1] = hm.get('o') - tempResult[0] - tempResult[2] - tempResult[4];
        tempResult[9] = (hm.get('n') - tempResult[1] - tempResult[7])/2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <tempResult.length ; i++) {
            for (int j = 0; j <tempResult[i] ; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
