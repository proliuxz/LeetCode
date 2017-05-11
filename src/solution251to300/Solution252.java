package solution251to300;

import Util.Interval;

import java.util.Arrays;

/**
 * Created by Xinzhuo Liu on 12/1/2016.
 */
public class Solution252 {
    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (x, y) -> x.start - y.start);
        for (int i = 1; i < intervals.length; i++)
            if (intervals[i - 1].end > intervals[i].start)
                return false;
        return true;
    }
}
