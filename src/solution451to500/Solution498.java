package solution451to500;

/**
 * Created by liu.xinzhou on 25/7/2017.
 */
public class Solution498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int r = 0;
        int c = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m * n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = matrix[r][c];
            if ((r+c)%2==0)
            {
                if (c == n-1)
                    r++;
                else if (r == 0)
                    c++;
                else
                {
                    r--;
                    c++;
                }
            }
            else {
                if (c == 0)
                    r++;
                else if (r == m-1)
                    c++;
                else
                {
                    r++;
                    c--;
                }
            }
        }

        return arr;
    }
}
