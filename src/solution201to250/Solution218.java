package solution201to250;

import java.util.ArrayList;
import java.util.List;

public class Solution218 {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();
        int max = 0;
        for (int[] b: buildings
             ) {
            if (b[1]>max)
                max = b[1];
        }
        int[] tmp = new int[max+1];
        for (int[] p: buildings
             ) {
            for (int i = p[0]; i <p[1] ; i++) {
                tmp[i] = Math.max(p[2],tmp[i]);
            }
        }
        int last = 0;
        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i]!=0) {
                if (last!=tmp[i])
                {
                    result.add(new int[]{i,tmp[i]});
                    last = tmp[i];
                }
            } else {
                if(last!=0)
                    result.add(new int[]{i,tmp[i]});
                last = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution218 s218 = new Solution218();
        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        List<int[]> res = s218.getSkyline(buildings);
    }
}
