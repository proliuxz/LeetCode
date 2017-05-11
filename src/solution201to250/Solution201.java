package solution201to250;

/**
 * Created by Liu Xinzhuo on 2016/4/16 0016.
 */
public class Solution201 {
    public int rangeBitwiseAnd(int m, int n)
    {
        int i = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            i++;
        }
        return (m << i);
    }
    public static void main(String[] args)
    {
        Solution201 s201 = new Solution201();
        System.out.println(s201.rangeBitwiseAnd(5,7));
    }
}
