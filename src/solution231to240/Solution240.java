package solution231to240;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Liu Xinzhuo on 2016/1/28 0028.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted in ascending from left to right.
 Integers in each column are sorted in ascending from top to bottom.
 For example,

 Consider the following matrix:

 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.

 Given target = 20, return false.
 */
public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0)
            return false;

        int m=0;
        int n=matrix[0].length-1;

        while(m<matrix.length && n>=0) {
            int x = matrix[m][n];
            if(target == x)
                return true;
            else if(target < x)
                --n;
            else
                ++m;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Solution240 solution240 = new Solution240();
        int matrix[][] = {{-1},{3}};
        System.out.println(solution240.searchMatrix(matrix,3));
    }
}
