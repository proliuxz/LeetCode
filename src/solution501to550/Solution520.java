package solution501to550;

/**
 * Created by Xinzhuo Liu on 3/10/2017.
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
