package solution321to330;

/**
 * Created by Liu Xinzhuo on 2016/4/26 0026.
 */
public class Solution329 {
    public int longestIncreasingPath(int[][] matrix) {
        return 0;
    }

    public static void main(String[] args)
    {
        Solution329 solution329 = new Solution329();
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(solution329.nextStep(matrix,0,0));
        System.out.println(solution329.nextStep(matrix,0,1));
        System.out.println(solution329.nextStep(matrix,0,2));
        System.out.println(solution329.nextStep(matrix,1,0));
        System.out.println(solution329.nextStep(matrix,1,1));
        System.out.println(solution329.nextStep(matrix,1,2));
    }

    public int cpL (int[][] matrix, int x, int y)
    {
        return matrix[x][y-1]>matrix[x][y]?nextStep(matrix,x,y-1)+1:0;
    }

    public int cpR (int[][] matrix, int x, int y)
    {
        return matrix[x][y+1]>matrix[x][y]?nextStep(matrix,x,y+1)+1:0;
    }

    public int cpU (int[][] matrix, int x, int y)
    {
        return matrix[x-1][y]>matrix[x][y]?nextStep(matrix,x-1,y)+1:0;
    }

    public int cpD (int[][] matrix, int x, int y)
    {
        return matrix[x+1][y]>matrix[x][y]?nextStep(matrix,x+1,y)+1:0;
    }

    public int nextStep(int[][] matrix,int x, int y)
    {
        int flag = 0;
        if (x == 0)
            flag += 1;
        if (x ==matrix.length-1)
            flag += 2;
        if (y == 0)
            flag += 4;
        if (y == matrix[0].length-1)
            flag += 8;

        int result = 0;
        switch (flag)
        {
            case  0:{
                int temp1 = Math.max(cpU(matrix,x,y),cpD(matrix,x,y));
                int temp2 = Math.max(cpL(matrix,x,y),cpR(matrix,x,y));
                return Math.max(result,Math.max(temp1,temp2));
            }
            case  1:{
                if (matrix[x][y]<matrix[x+1][y])
                    result = Math.max(result,nextStep(matrix,x+1,y));
                if (matrix[x][y]<matrix[x-1][y])
                    result = Math.max(result,nextStep(matrix,x-1,y));
                if (matrix[x][y]<matrix[x][y+1])
                    result = Math.max(result,nextStep(matrix,1,y+1));
                if (matrix[x][y]<matrix[x][y-1])
                    result = Math.max(result,nextStep(matrix,x,y-1));
                return result;
            }
            case  2:{}
            case  4:{}
            case  5:{}
            case  6:{}
            case  8:{}
            case  9:{}
            case 10:{}
        }
       return flag;
    }
}
