package solution051to060;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/9 0009.
 */
public class Solution51 {
    public List<List<String>> result = new ArrayList<List<String>>();
    int[] A;

    public List<List<String>> solveNQueens(int n) {
        A = new int[n];
        nqueens(0, n);
        return result;
    }

    public void nqueens(int cur, int n){
        if(cur==n)
            printres(n);
        else
        {
            for(int i=0;i<n;i++)
            {
                A[cur] = i;
                if(val(cur))
                {
                    nqueens(cur+1, n);
                }
            }
        }
    }

    public void printres(int n)
    {
        
    }

    public boolean val(int pos)
    {
        for(int i=0;i<pos;i++){
            if(A[i]==A[pos]|| Math.abs(A[i]-A[pos])==pos-i){
                return false;
            }
        }
        return true;
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
