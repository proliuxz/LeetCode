package solution651to700;

/**
 * Created by Liu XZ on 2017/8/21.
 */
public class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        if (M==null||M.length==0)
            return M;
        int sum = 0;
        int row = M.length;
        int col = M[0].length;
        int surr = 0;
        int [][] res = new int[row][col];
        for( int i = 0; i < row; i++ )
        {
            for( int j = 0; j < col; j++ )
            {
                sum = 0;
                surr = 0;
                for( int k = i-1; k <= i+1; k++ )
                {
                    for( int p = j - 1; p <= j+1; p++ )
                    {
                        if( k < 0 || p < 0 || k >= row || p >= col )
                        {
                            continue;
                        }
                        sum += M[k][p];
                        surr++;
                    }
                }
                res[i][j] = sum / surr;
            }
        }
        return res;
    }
}
