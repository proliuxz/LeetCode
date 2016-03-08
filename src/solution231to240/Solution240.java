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
    public static class Pos
    {
        int x;
        int y;
        public Pos(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public boolean searchIt(int[] array,int target)
    {
        HashSet<Integer> temp = new HashSet<Integer>();
        for (int x :array
             ) {
            temp.add(x);
        }
        return temp.contains(target);
    }
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if (matrix==null)
            return false;
        if (matrix.length==1&&matrix[0].length==1)
            return target==matrix[0][0];
        HashMap<Integer,Pos> keyPos = new HashMap<Integer, Pos>();
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(m+";"+n);
        int len = Math.max(m,n);
        int key[] = new int[len];
        int min = Math.min(m,n);
        int flag = 0;
        if (m==n)
            flag = 0;
        else if (m<n)
            flag = 1;
        else
            flag = 2;
        for (int i = 0 ;i<min;i++)
        {
            key[i] = matrix[i][i];
            keyPos.put(key[i],new Pos(i,i));
        }
        switch (flag)
        {
            case 0: break;
            case 1:
            {
                int rest = len - min;
                System.out.println(rest);
                for (int i = 0; i < rest;i++)
                {
                    key[min+i] = matrix[m-1][min+i-1];
                    keyPos.put(key[min+i],new Pos(m-1,min+i-1));
                }
                break;
            }
            case 2:
            {
                int rest = len - min;
                System.out.println(rest);
                for (int i = 0;i < rest;i++)
                {
                    key[min+i] = matrix[min+i-1][n-1];
                    keyPos.put(key[min+i],new Pos(min+i-1,n-1));
                }
                break;
            }
        }
        for (int i = 0 ; i <key.length;i++)
        {
            if (key[i]==target)
                return true;
            else if (key[i]>target)
            {
                Pos pos = keyPos.get(key[i]);
                int x = pos.x;
                int y = pos.y;
                int[] array = new int[x+y];
                for (int a = 0 ; a < x;a++)
                {
                    array[a] = matrix[a][y];
                }
                for (int b = 0; b<y;b++)
                {
                    array[x+b] = matrix[x][b];
                }
                return searchIt(array,target);
            }
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
