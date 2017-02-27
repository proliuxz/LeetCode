package solution401to410;

/**
 * Created by Xinzhuo Liu on 12/13/2016.
 */
public class Solution408 {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }
            if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
                return false;
            }
            int start = j;
            while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                j++;
            }
            int num = Integer.valueOf(abbr.substring(start, j));
            i += num;
        }
        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        Solution408 s408 = new Solution408();
        String[] words = {"internationalization", "apple"};
        String[] abbrs = {"i12iz4n", "a2e"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(s408.validWordAbbreviation(words[i], abbrs[i]));
        }
    }
}
