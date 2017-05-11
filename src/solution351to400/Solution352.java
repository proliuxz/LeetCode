package solution351to400;

import Util.Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static Util.Show.show;

/**
 * Created by Xinzhuo Liu on 10/31/2016.
 */
public class Solution352 {
    /** Initialize your data structure here. */
    HashSet<Integer> boards;
    HashMap<Integer,Interval> headToInterval;
    HashMap<Integer,Interval> tailToInterval;
    List<Interval> intervals;
    public Solution352() {
        boards = new HashSet<>();
        intervals = new ArrayList<>();
        headToInterval = new HashMap<>();
        tailToInterval = new HashMap<>();
    }

    public void addNum(int val)
    {
        if (boards.contains(val))
            return;
        int flag = 0;
        if (boards.contains(val-1))
            flag += 1;
        if (boards.contains(val+1))
            flag += 2;
        switch (flag)
        {

            case 0: {
                Interval i = new Interval(val,val);
                intervals.add(i);
                headToInterval.put(val,i);
                tailToInterval.put(val,i);
                boards.add(val);
                break;
            }
            case 1: {
                Interval i = tailToInterval.get(val-1);
                i.end = val;
                tailToInterval.remove(val-1);
                tailToInterval.put(val,i);
                boards.remove(val-1);
                boards.add(val);
                break;
            }
            case 2: {
                Interval i = tailToInterval.get(val+1);
                i.start = val;
                headToInterval.remove(val+1);
                headToInterval.put(val,i);
                boards.remove(val+1);
                boards.add(val);
                break;
            }
            case 3: {
                Interval pre = tailToInterval.get(val-1);
                Interval after  = headToInterval.get(val+1);
                Interval i = new Interval(pre.start, after.end);
                intervals.remove(pre);
                intervals.remove(after);
                intervals.add(i);
                headToInterval.remove(val-1);
                tailToInterval.remove(val+1);
                headToInterval.put(i.start,i);
                tailToInterval.put(i.end,i);
                boards.remove(val-1);
                boards.remove(val+1);
                break;
            }
        }
    }

    public List<Interval> getIntervals() {
        return intervals;
    }

    public static void main(String[] args)
    {
        int[] test = {  49, 97, 53,  5, 33, 65, 62, 51,100, 38, 61,
                        45, 74, 27, 64, 17, 36, 17, 96, 12, 79, 32,
                        68, 90, 77, 18, 39, 12, 93,  9, 87, 42, 60,
                        71, 12, 45, 55, 40,78,81,26,70,61,56,66,33,7,70,1,11,92,51,90,100,85,80,0,78,63,42,31,93,41,90,8,24,72,28,30,18,69,57,11,10,40,65,62,
                13,38,70,37,90,15,70,42,69,26,77,70,75,36,56,11,76,49,40,73,30,37,23};
        Solution352 s352= new Solution352();
        for (int i = 0; i <test.length ; i++) {
            System.out.println(i);
            s352.addNum(test[i]);
            show(s352.getIntervals());
            System.out.println(test[i]+"--------------------------");
        }
    }
}
