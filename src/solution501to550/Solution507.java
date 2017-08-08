package solution501to550;

import Util.Show;

/**
 * Created by Liu XZ on 2017/6/10.
 */
public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 0 || num ==1)
            return false;
        int result = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i == 0)
            {
                result += i;
                int rest = num/i;
                if (rest != i)
                    result += rest;
            }
            if (result>num)
                return false;
        }
        return result==num;
    }

    public static void main (String[] args) {
        Solution507 solution507 = new Solution507();
        int num = 1;
        System.out.print(solution507.checkPerfectNumber(num));
    }
}
