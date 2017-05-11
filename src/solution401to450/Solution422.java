package solution401to450;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/8/2016.
 */
public class Solution422 {
    public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) {
            return true;
        }
        int n = words.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= n || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j))
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("abcd");
        words.add("bnrt");
        words.add("crm");
        words.add("dt");
        Solution422 s422 = new Solution422();
        s422.validWordSquare(words);
    }
}
