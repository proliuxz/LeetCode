package solution271to280;

/**
 * Created by Liu Xinzhuo on 2016/4/17 0017.
 */
public class Solution275 {
    public int hIndex(int[] citations) {
        if(citations==null||citations.length==0)
            return 0;
        int left = 0;
        int right = citations.length - 1;
        int n = citations.length;
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (n - mid > citations[mid])
                left = mid + 1;
            else
                right = mid;
        }
        return Math.min((n - right) , citations[right]);
    }
}
