package solution451to500;

/**
 * Created by Xinzhuo Liu on 2/17/2017.
 */
public class Solution476 {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                sb.append(1);
            else sb.append(0);
        }
        String resultString = sb.toString();
        return Integer.parseInt(resultString, 2);
    }
}
