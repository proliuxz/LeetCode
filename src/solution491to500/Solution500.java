package solution491to500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 2/27/2017.
 */
public class Solution500 {
    public String[] findWords(String[] words) {
        String[] letters = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashMap<Character, Integer> letterRow = new HashMap();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length(); j++) {
                letterRow.put(letters[i].charAt(j), i);
            }
        }
        List<String> result = new ArrayList<String>();
        for (String s : words
                ) {
            String sLowerCase = s.toLowerCase();
            int rowNum = letterRow.get(sLowerCase.charAt(0));
            for (int i = 1; i < s.length() && rowNum != 0; i++) {
                if (rowNum != letterRow.get(sLowerCase.charAt(i)))
                    rowNum = 0;
            }
            if (rowNum!=0)
                result.add(s);
        }
        return result.toArray(new String[0]);
    }
}
