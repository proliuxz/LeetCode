package solution451to500;

/**
 * Created by Liu XZ on 2017/6/4.
 */
public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0)
            return 0;
        int result = 0;
        int pos = timeSeries[0];
        for (int t : timeSeries
                ) {
            result += t < pos + duration ? t - pos : duration;
            pos = t;
        }
        return result + duration;
    }
}
