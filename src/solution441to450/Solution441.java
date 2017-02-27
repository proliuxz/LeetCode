package solution441to450;

/**
 * Created by Xinzhuo Liu on 12/8/2016.
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        int i = 0;
        while (n>i)
        {
            i++;
            n-=i;
        }
        return i;
    }
}
