package solution411to420;

import java.util.HashSet;

/**
 * Created by Xinzhuo Liu on 11/2/2016.
 */
public class Solution419 {
    public int countBattleships(char[][] board) {

        int result = 0;

        if (board==null || board.length==0 || board[0]==null || board[0].length==0)
            return result;

        for (int i = 0; i <board.length ; i++)
        {
            for (int j = 0; j <board[0].length ; j++)
            {
                if ((board[i][j] == 'X') && (i - 1 < 0 || board[i - 1][j] == '.') && (j - 1 < 0 || board[i][j - 1] != 'X') )
                {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        char[][] board = {{'.','X'},{'X','.'}};
        Solution419 s419 = new Solution419();
        s419.countBattleships(board);
    }
}
