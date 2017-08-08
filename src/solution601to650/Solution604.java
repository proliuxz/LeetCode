package solution601to650;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Liu XZ on 2017/6/18.
 */
public class Solution604 {
    String res;
    int ptr = 0;
    int num = 0;
    char ch = ' ';
    public Solution604 (String compressedString) {
        res = compressedString;
    }

    public char next() {
        if (!hasNext())
            return ' ';
        if (num == 0) {
            ch = res.charAt(ptr++);
            while (ptr < res.length() && Character.isDigit(res.charAt(ptr))) {
                num = num * 10 + res.charAt(ptr++) - '0';
            }
        }
        num--;
        return ch;
    }

    public boolean hasNext() {
        return ptr != res.length() || num != 0;
    }

    public static void main(String[] args) {
        String s = "L1e2t1C1o1d1e1";
        Solution604 s604 = new Solution604(s);
        System.out.println(s604.next());
        System.out.println(s604.next());
        System.out.println(s604.next());
        System.out.println(s604.next());
        System.out.println(s604.next());
        System.out.println(s604.next());
        System.out.println(s604.hasNext());
        System.out.println(s604.next());
        System.out.println(s604.hasNext());
    }
}
