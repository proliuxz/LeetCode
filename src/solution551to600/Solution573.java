package solution551to600;

/**
 * Created by liu.xinzhou on 31/5/2017.
 */
public class Solution573 {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int distance = 0;
        int ssnt = Integer.MIN_VALUE;
        for (int[] nut : nuts
                ) {
            distance += distance(nut, tree) * 2;
            ssnt = Math.max((distance(nut, tree) - distance(squirrel, nut)), ssnt);
        }
        return distance - ssnt;
    }

    private int distance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}
