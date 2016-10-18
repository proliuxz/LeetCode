package solution201to210;

import java.util.*;

/**
 * Created by Liu Xinzhuo on 2016/5/24 0024.
 * There are a total of n courses you have to take, labeled from 0 to n - 1.

 Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

 For example:

 2, [[1,0]]
 There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.

 2, [[1,0],[0,1]]
 There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 */
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,Point> hashMap = new HashMap<>();
        for (int i = 0; i < numCourses ; i++) {
            Point point = new Point(i);
            hashMap.put(i,point);
        }
        for (int[] record:prerequisites)
        {
            hashMap.get(record[0]).getOut().add(record[1]);
            hashMap.get(record[1]).getIn().add(record[0]);
        }
        while (true)
        {
            int pointIdx = findNoInDegree(hashMap);
            if (pointIdx==-1)
            {
                for (Point point:hashMap.values())
                {
                    if (point.getIn().size()!=0)
                        return false;
                }
                return true;
            }
            else
            {
                Point point = hashMap.get(pointIdx);
                for (int idx: point.getOut())
                {
                    hashMap.get(idx).getIn().remove(pointIdx);
                }
                hashMap.remove(pointIdx);
            }
        }
    }

    public int findNoInDegree(HashMap<Integer,Point> hashMap)
    {
        for (Integer key: hashMap.keySet())
        {
            if (hashMap.get(key).getIn().size()==0)
                return key;
        }
        return -1;
    }

    class Point
    {
        int num = 0;
        HashSet<Integer> in;
        HashSet<Integer> out;

        Point(int num)
        {
            this.num = num;
            this.in = new HashSet<>();
            this.out = new HashSet<>();
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public HashSet<Integer> getOut() {
            return out;
        }

        public void setOut(HashSet<Integer> out) {
            this.out = out;
        }

        public HashSet<Integer> getIn() {
            return in;
        }

        public void setIn(HashSet<Integer> in) {
            this.in = in;
        }
    }

    public static void main(String[] args)
    {
        Solution207 solution207 = new Solution207();
        int num = 2;
        int[][] pairs = {{0,1},{1,0}};
        System.out.println(solution207.canFinish(num,pairs));
    }
}
