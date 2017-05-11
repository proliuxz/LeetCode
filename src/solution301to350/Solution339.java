package solution301to350;

import java.util.List;
import Util.NestedInteger;

/**
 * Created by Xinzhuo Liu on 11/27/2016.
 */
public class Solution339 {
    public int depthSum(List<NestedInteger> nestedList) {
        return depthSumHelper(nestedList,1);
    }

    public int depthSumHelper(List<NestedInteger> nestedList, int depth) {
        int result = 0;
        for(NestedInteger nestedInteger: nestedList)
        {
            result+= nestedInteger.isInteger() ? nestedInteger.getInteger() * depth : depthSumHelper(nestedInteger.getList(),depth+1);
        }
        return result;
    }
}