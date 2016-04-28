package solution271to280;

import java.util.Arrays;

/**
 * Created by Liu Xinzhuo on 2016/4/17 0017.
 */
public class Solution274 {
    public int hIndex(int[] citations) {
        int result = 0;
        if (citations==null||citations.length==0)
            return result;
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0 && citations[i] >= (citations.length - i) ; --i)
        {
            result = citations.length - i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Solution274 s274 = new Solution274();
        int[] citations = {0,1};
        System.out.println(s274.hIndex(citations));
    }
}
