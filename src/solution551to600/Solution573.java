package solution551to600;

/**
 * Created by Liu XZ on 2017/5/23.
 */
public class Solution573 {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int select = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < nuts.length; i++) {
            int dis = calcDistance(nuts[i][0], nuts[i][1], squirrel[0], squirrel[1]) + calcDistance(nuts[i][0], nuts[i][1], tree[0], tree[1]);
            if (dis < distance) {
                distance = dis;
                select = i;
            }
        }
        int[] h = new int[height];
        int[] w = new int[width];
        for (int i = 0; i < nuts.length; i++) {
            {
                h[nuts[i][0]]++;
                w[nuts[i][1]]++;
            }
        }
        int result = distance;
        for (int i = 0; i <h.length ; i++) {
            result += Math.abs(i-tree[0])*h[i]*2;
        }
        for (int i = 0; i <w.length ; i++) {
            result += Math.abs(i-tree[1])*w[i]*2;
        }
        return result;
    }

    private int calcDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main (String[] args) {
        int height = 5;
        int width = 5;
        int[] tree = new int[]{3,2};
        int[] squirrel = new int[] {0,1};
        int[][] nuts = new int[][] {{0,0},{0,2},{0,4},{1,0},{1,3},{1,4},{2,0},{2,1},{2,2},{2,3},{2,4},{3,0},{3,1},{3,3},{3,4},{4,0},{4,1},{4,2},{4,4},{4,3}};
        Solution573 s573 = new Solution573();
        System.out.println(s573.minDistance(height,width,tree,squirrel,nuts));
    }
}
