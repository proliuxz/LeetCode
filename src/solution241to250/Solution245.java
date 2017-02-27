package solution241to250;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        boolean isSame = word1.equals(word2);
        int idx1 = -1;
        int idx2 = -1;
        int min = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1))
                idx1 = i;
            else if (words[i].equals(word2))
                idx2 = i;
            else
                continue;
            if (idx1 >= 0 && idx2 >= 0)
                min = Math.min(min, Math.abs(idx1 - idx2));
            if (isSame)
                idx2 = idx1;
        }
        return min;
    }
}
