package solution341to350;

/**
 * Created by Liu Xinzhuo on 2016/4/18 0018.
 */
public class Solution342 {
    public boolean isPowerOfFour(int num) {
        double result = Math.log(num)/Math.log(4);
        if (result==(int)result)
            return true;
        return false;
    }
}
