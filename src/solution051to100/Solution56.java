package solution051to100;

import Util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public class IntervalsComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals==null || intervals.size()==0)
            return result;
        Collections.sort(intervals,new IntervalsComparator());

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (int i = 0; i <intervals.size() ; i++) {
            Interval interval = intervals.get(i);
            if (interval.start > end) {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            } else {
                end = Math.max(end, interval.end);
            }
        }
        result.add(new Interval(start,end));
        return result;
    }
}


