package solution351to400;

/**
 * Created by Liu XZ on 2017/8/9.
 */
public class Solution390 {
    public int lastRemaining(int n) {
        boolean left = true;
        int remaining = n;
        int step = 1;
        int head = 1;
        while (remaining > 1) {
            if (left || remaining % 2 == 1) {
                head = head + step;
            }
            remaining = remaining >> 1;
            step = step << 1;
            left = !left;
        }
        return head;
    }
}
