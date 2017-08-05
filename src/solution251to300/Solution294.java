package solution251to300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu.xinzhou on 21/7/2017.
 */
public class Solution294 {
    public boolean canWin(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.startsWith("++", i)) {
                String t = s.substring(0, i) + "--" + s.substring(i + 2);
                if (!canWin(t)) {
                    return true;
                }
            }
        }
        return false;
    }
}
