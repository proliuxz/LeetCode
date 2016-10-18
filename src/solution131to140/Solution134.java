package solution131to140;

/**
 * Created by Liu Xinzhuo on 2016/5/24 0024.
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas==null||gas.length==0)
            return -1;
        if (gas.length==1)
            return 1;
        int sum = 0;
        int start = -1;
        int cur = 0;
        for (int i = 0; i <gas.length ; i++) {
            sum += gas[i] - cost[i];
            cur += gas[i] - cost[i];
            if (cur<0)
            {
                start = i;
                cur = 0;
            }
        }
        if (sum<0)
            return -1;
        else
            return start+1;
    }
}
