package solution251to260;

/**
 * Created by Liu Xinzhuo on 2015/9/15.
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class Solution258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
