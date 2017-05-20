package solution511to550;

/**
 * Created by Xinzhuo Liu on 5/12/2017.
 */
public class Solution521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
