package solution391to400;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 12/12/2016.
 */
public class Solution396 {
    public int maxRotateFunction(int[] A) {
        if (A==null||A.length==0)
            return 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            result = Math.max(result, calc(A, i));
        }
        return result;
    }

    public int calc(int[] A, int pos) {
        int result = 0;
        int cur = A.length - pos;
        for (int i = 0; i < A.length; i++) {
            if (cur == A.length)
                cur = 0;
            result += A[i] * cur++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 0, 0, 0, 0, 0, 0, 0, 7};
        Solution396 s396 = new Solution396();
        System.out.println(s396.maxRotateFunction(A));
    }
}
