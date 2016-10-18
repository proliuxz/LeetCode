package solution041to050;

import static java.lang.Math.pow;

/**
 * Created by Liu Xinzhuo on 2016/5/23 0023.
 */
public class Solution50 {
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        if(n<0)
            return 1.0/pow(x,-n);
        double half = pow(x,n>>1);
        if(n%2==0)
            return half*half;
        else
            return half*half*x;
    }
}
