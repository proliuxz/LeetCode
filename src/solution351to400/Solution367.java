package solution351to400;

/**
 * Created by Liu XZ on 2017/6/10.
 */
public class Solution367 {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
}
