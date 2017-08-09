package solution451to500;

import java.util.Arrays;

/**
 * Created by liu.xinzhou on 4/8/2017.
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points==null || points.length==0)
            return 0;
        Arrays.sort(points, (x , y) -> x[0] == y[0] ? x[1] - y[1] : x[0] -y[0]);
        int count = 1;
        int arrowLimit = points[0][1];
        for(int i=1;i<points.length;i++) {
            if(points[i][0]<=arrowLimit) {
                arrowLimit=Math.min(arrowLimit, points[i][1]);
            } else {
                count++;
                arrowLimit=points[i][1];
            }
        }
        return count;
    }
}
