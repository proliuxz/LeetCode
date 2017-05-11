package solution201to250;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int idx1 = -1;
        int idx2 = -1;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                idx1 = i;
                if (idx2 != -1)
                    distance = Math.min(distance, idx1 - idx2);
            }
            if (words[i].equals(word2)) {
                idx2 = i;
                if (idx1 != -1)
                    distance = Math.min(distance, idx2 - idx1);
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        Solution243 s243 = new Solution243();
        String[] words = {"a", "c", "a", "b"};
        String word1 = "a";
        String word2 = "b";
        System.out.println(s243.shortestDistance(words, word1, word2));
    }
}
