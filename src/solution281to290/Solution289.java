package solution281to290;

/**
 * Created by Liu Xinzhuo on 2016/1/14 0014.
 */
public class Solution289
{
    public void gameOfLife(int[][] board)
    {
        int h = board.length;
        int w = board[0].length;
        if (h==1||w==1)
        {
           for (int i = 0 ; i < h ;i++)
               for (int j = 0 ; j <w ; j++)
               {
                   board[i][j]=0;
               }
            return;
        }
        for(int i = 0 ; i < h ; i ++)
            for(int j = 0 ; j < w ; j++) {
                if (i == 0 && j == 0)
                {
                    board[i][j] = LorD(board[i][j],board[i][j+1]%10+board[i+1][j]%10+board[i+1][j+1]%10);
                }
                else if(i ==0 && j ==w-1)
                {
                    board[i][j] = LorD(board[i][j],board[i+1][j]%10+board[i][j-1]%10+board[i+1][j-1]%10);
                }
                else if(i==h-1&& j==0)
                {
                    board[i][j] = LorD(board[i][j],board[i-1][j]%10+board[i][j+1]%10+board[i-1][j+1]%10);
                }
                else if (i==h-1&& j==w-1)
                {
                    board[i][j] = LorD(board[i][j],board[i-1][j]%10+board[i][j-1]%10+board[i-1][j-1]%10);
                }
                else if (i == 0) {
                    board[i][j] = LorD((board[i][j]),board[i+1][j]%10+board[i][j-1]%10+board[i][j+1]%10+board[i+1][j-1]%10+board[i+1][j+1]%10);
                } else if (j == 0) {
                    board[i][j] = LorD((board[i][j]),board[i][j+1]%10+board[i-1][j]%10+board[i+1][j]%10+board[i-1][j+1]%10+board[i+1][j+1]%10);
                } else if (i == h - 1) {
                    board[i][j] = LorD((board[i][j]),board[i][j+1]%10+board[i][j-1]%10+board[i-1][j]%10+board[i-1][j-1]%10+board[i-1][j+1]%10);
                } else if (j == w - 1) {
                    board[i][j] = LorD((board[i][j]),board[i][j-1]%10+board[i-1][j]%10+board[i+1][j]%10+board[i-1][j-1]%10+board[i+1][j-1]%10);
                } else {
                    board[i][j] = LorD((board[i][j]),board[i][j-1]%10+board[i-1][j]%10+board[i+1][j]%10+board[i][j+1]%10+
                            board[i-1][j-1]%10+board[i+1][j-1]%10+board[i-1][j+1]%10+board[i+1][j+1]%10);
                }
                System.out.println("i:"+i+"j:"+j+"value:"+board[i][j]);
            }
        for (int i =0;i<h;i++)
            for (int j = 0; j<w ; j++)
            {
                board[i][j]/=10;
            }
    }

    public int LorD(int current,int mates)
    {
        int stat = 0;
        switch (mates)
        {
            case 2:{stat = current; break;}
            case 3:{stat = 1; break;}
            default:{stat = 0; break;}
        }
        return current+stat*10;
    }

    public static void main(String [] args)
    {
        Solution289 s289 = new Solution289();
        int board[][] = {{1,1,1},{0,1,1}};
        s289.gameOfLife(board);
        for (int i =0;i<board.length;i++)
            for (int j = 0; j<board[0].length ; j++)
            {
                System.out.println(board[i][j]);
            }
    }
}
