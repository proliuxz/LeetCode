package solution601to650;

import java.util.List;

/**
 * Created by Liu XZ on 2017/7/23.
 */
public class Solution648 {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <words.length ; i++) {
            for (String item: dict
                 ) {
                if (words[i].startsWith(item))
                words[i] = item;
            }
            sb.append(words[i]);
            if (i!=words.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
