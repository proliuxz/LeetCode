package solution051to100;

import java.util.ArrayList;
import java.util.List;

public class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        if (words.length==0)
            return res;
        int pos = 0;
        while (pos<words.length) {
            int count = 0;
            while (count + words[pos].length() < maxWidth) {
                pos++;
                count += words[pos].length()+1;
            }
        }
        return null;
    }
}
