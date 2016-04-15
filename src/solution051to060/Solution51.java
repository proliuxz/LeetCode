package solution051to060;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/9 0009.
 */
public class Solution51 {
    HashMap valMap = new HashMap<Integer,Integer>();
    public List<List<String>> solveNQueens(int n) {
        return null;
    }

    public boolean val(int pos)
    {
        return false;
    }

    public static void main(String [] args)
    {
        Solution51 s51 = new Solution51();
        int x = 5;
        List<List<String>> result = s51.solveNQueens(x);
        for(List<String> list : result)
        {
            for (String s: list)
            {
                System.out.println(s);
            }
            System.out.println("============================");
        }
    }
}
