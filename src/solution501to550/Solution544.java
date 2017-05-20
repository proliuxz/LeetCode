package solution501to550;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu XZ on 2017/5/6.
 */
public class Solution544 {
    public String findContestMatch(int n) {
        List<String> thisLevel = new ArrayList<>();
        int x = 1;
        while (x<n)
            x*=2;
        for (int i = 1; i < x + 1 ; i++) {
            if (i<=n)
                thisLevel.add(Integer.toString(i));
            else
                thisLevel.add("");
        }
        return findContestMatchHelper(thisLevel).get(0);
    }

    public List<String> findContestMatchHelper(List<String> thisLevel) {
        if (thisLevel.size()==1)
            return thisLevel;
        List<String> nextLevel = new ArrayList<>();
        for (int i = 0; i <thisLevel.size()/2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(thisLevel.get(i));
            sb.append(',');
            sb.append(thisLevel.get(thisLevel.size()-i-1));
            sb.append(')');
            nextLevel.add(sb.toString());
        }
        return findContestMatchHelper(nextLevel);
    }
}
