package solution251to300;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 12/15/2016.
 */
public class Solution288 {
    HashMap<String, String> dics;

    public Solution288(String[] dictionary) {
        dics = new HashMap<String, String>();
        for (String str : dictionary) {
            String key = getAbbr(str);
            // If there is more than one string belong to the same key
            // then the key will be invalid, we set the value to ""
            if (dics.containsKey(key)) {
                if (!dics.get(key).equals(str)) {
                    dics.put(key, "");
                }
            } else {
                dics.put(key, str);
            }
        }
    }

    public boolean isUnique(String word) {
        return !dics.containsKey(getAbbr(word)) || dics.get(getAbbr(word)).equals(word);
    }

    public String getAbbr(String s) {
        if (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            sb.append(s.length() - 2);
            sb.append(s.charAt(s.length() - 1));
            return sb.toString();
        }
        return s;
    }
}
