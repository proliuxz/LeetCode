package solution351to400;

/**
 * Created by Xinzhuo Liu on 11/5/2016.
 */
public class Solution371 {
    public int getSum (int a, int b){
        while (b!=0)
        {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
            System.out.println(a);
            System.out.println(b);
        }
        return a;
    }
    public static void main(String[] args)
    {
        Solution371 s371 = new Solution371();
        System.out.println(s371.getSum(11111,22222));
    }
}
