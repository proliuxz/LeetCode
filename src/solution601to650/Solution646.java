package solution601to650;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by liu.xinzhou on 28/7/2017.
 */
public class Solution646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,this.IntArrayComparator);
        return findLongestChainHelper(pairs,0,Integer.MIN_VALUE,0);
    }

    public int findLongestChainHelper(int[][] pairs, int pos, int tail, int result) {
        for (int i = pos; i <pairs.length ; i++) {
            if (pairs[i][0]>tail) {
                return Math.max(findLongestChainHelper(pairs,i+1, pairs[i][1],result+1),
                        findLongestChainHelper(pairs,i+1,tail,result));
            }
        }
        return result;
    }

    private static Comparator<int[]> IntArrayComparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0]-o2[0];
        }
    };

    public static void main (String[] args) {
        int[][] pairs = {{2,3},{3,4},{1,2}};
        Solution646 s646 = new Solution646();
        System.out.print(s646.findLongestChain(pairs));
    }
}
