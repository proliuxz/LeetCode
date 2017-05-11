package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/1/14 0014.
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
