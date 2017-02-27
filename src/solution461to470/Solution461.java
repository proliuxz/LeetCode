package solution461to470;

/**
 * Created by Xinzhuo on 2016/11/29 0029.
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
    public static void main(String[] args)
    {
        int x = 1;
        int y = 4;
        Solution461 s461 = new Solution461();
        s461.hammingDistance(x,y);
    }
}
