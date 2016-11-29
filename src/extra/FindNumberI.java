package extra;

import java.util.HashSet;

/**
 * Created by Xinzhuo Liu on 11/27/2016.
 */
public class FindNumberI {
    public int[] findNumber(int n)
    {
        int[] result = new int[n];
        result[0] = 0;
        int tmp = 1;
        for (int i = 1; i< result.length; i++)
        {
            result[i] = result[i-1]+(tmp++);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int n =10;
        FindNumberI fni = new FindNumberI();
        int[] result = fni.findNumber(n);
        for (int res: result
             ) {
            System.out.println(res);
        }
    }
}
