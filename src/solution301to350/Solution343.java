package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/4/24 0024.
 */
public class Solution343 {
    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        return (int)Math.pow(3, (n-2)/3)*((n-2)%3+2);
    }
}
