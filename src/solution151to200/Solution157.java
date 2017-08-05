package solution151to200;

/**
 * Created by Xinzhuo Liu on 12/11/2016.
 */
public class Solution157 extends Reader4{
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int idx = 0;

        while (true) {
            int curr = read4(buffer);
            int currLen = Math.min(curr, n - idx);

            for (int i = 0; i < currLen; i++) {
                buf[idx + i] = buffer[i];
            }
            idx += currLen;

            if (currLen != 4 || idx == n) return idx;
        }
    }
}

class Reader4
{
    public int read4(char[]buf){
        return 0;
    }
}
