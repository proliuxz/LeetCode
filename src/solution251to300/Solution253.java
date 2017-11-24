package solution251to300;

import Util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution253 {
    public int minMeetingRooms(Interval[] intervals) {
        int res = 0;
        int ava = 0;
        List<TimePoint> list = new ArrayList<TimePoint>();
        for (Interval interval: intervals
             ) {
            list.add(new TimePoint(interval.start,true));
            list.add(new TimePoint(interval.end, false));
        }
        Collections.sort(list, new Comparator<TimePoint>() {
            @Override
            public int compare(TimePoint o1, TimePoint o2) {
                return o1.time!=o2.time ? o1.time-o2.time: (o1.start==false?-1:1);
            }
        });
        for (TimePoint tp: list
             ) {
            if (tp.start==true) {
                if (res==ava) {
                    res++;
                    ava++;
                }
                else {
                    ava++;
                }
            } else {
                ava--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution253 s253 = new Solution253();
        Interval[] intervals = new Interval[] {new Interval(0,5), new Interval(5,10), new Interval(15, 20)};
        s253.minMeetingRooms(intervals);
    }
}
class TimePoint {
    int time;
    boolean start;
    TimePoint(int time, boolean start) {
        this.time = time;
        this.start = start;
    }
}
