package solution461to470;

/**
 * Created by Xinzhuo Liu on 11/21/2016.
 * 463. Island Perimeter   QuestionEditorial Solution  My Submissions
 Total Accepted: 2087
 Total Submissions: 3493
 Difficulty: Easy
 Contributors: amankaraj
 You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 Example:

 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 Answer: 16
 Explanation: The perimeter is the 16 yellow stripes in the image below:
 */
public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int d = 0;
        int n = 0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]==1)
                {
                    n++;
                    if (i>0&&grid[i-1][j]==1)
                        d++;
                    if (j>0&&grid[i][j-1]==1)
                        d++;
                }
            }
        }
        return (n<<2)-(d<<1);
    }
    public static void main(String[] args)
    {
        Solution463 s463 = new Solution463();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(s463.islandPerimeter(grid));
    }
}
