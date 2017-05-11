package solution401to450;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 11/22/2016.
 *
 * 447. Number of Boomerangs   QuestionEditorial Solution  My Submissions
 Total Accepted: 4492
 Total Submissions: 10888
 Difficulty: Easy
 Contributors: alexander54
 Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

 Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

 Example:
 Input:
 [[0,0],[1,0],[2,0]]

 Output:
 2

 Explanation:
 The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        if (points==null||points.length<3)
            return 0;
        int n = points.length;
        int result = 0;
        for(int i=0;i<n;i++){
            HashMap<Double,Integer> hm = new HashMap<>();
            for(int j=0;j<n;j++){
                double dis = getDistance2Pow(points[i],points[j]);
                if(hm.containsKey(dis)){
                    int value = hm.get(getDistance2Pow(points[i],points[j]));
                    result += value<<1;
                    hm.put(dis,value+1);
                }
                else {
                    hm.put(dis,1);
                }
            }
        }
        return result;
    }

    private double getDistance2Pow(int[] x, int[] y){
        return Math.pow(x[0]-y[0],2)+Math.pow(x[1]-y[1],2);
    }
}

