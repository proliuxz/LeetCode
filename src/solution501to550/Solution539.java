package solution501to550;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liu.xinzhou on 26/7/2017.
 */
public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        int[] timePointArr = new int[timePoints.size()];
        for (int i = 0; i <timePoints.size() ; i++) {
            timePointArr[i] = helper(timePoints.get(i));
        }
        Arrays.sort(timePointArr);
        for (int i = 0; i <timePointArr.length-1 ; i++) {
            min = Math.min(min,timePointArr[i+1]-timePointArr[i]);
        }
        min = Math.min(min,timePointArr[0]+1440-timePointArr[timePointArr.length-1]);
        return min;
    }

    private int helper(String timePoint) {
        String[] time = timePoint.split(":");
        int timeHInt = Integer.parseInt(time[0]);
        int timeMInt = Integer.parseInt(time[1]);
        return 60*timeHInt+timeMInt;
    }
}
