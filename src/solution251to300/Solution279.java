package solution251to300;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Liu Xinzhuo on 2016/4/17 0017.
 */
public class Solution279 {
    public int numSquares(int n) {
        while (n % 4 == 0)
            n /= 4;
        if (n % 8 == 7)
            return 4;
        for (int a=0; a*a<=n; ++a) {
            int b =(int) Math.sqrt( n - a*a );
            if (a*a + b*b == n)
            {
                a = (a==0)?0:1;
                b = (b==0)?0:1;
                return a+b;
            }
        }
        return 3;
    }
}
