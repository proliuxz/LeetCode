package solution031to040;

import Util.Show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/5/24 0024.
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates==null||candidates.length==0)
            return result;
        Arrays.sort(candidates);
        dfs(result,candidates,new ArrayList<>(),target,0);
        return result;
    }
    public void dfs(List<List<Integer>> result, int[] candidates, List<Integer> cache, int target,int pos)
    {
        if (target <= 0)
        {
            if (target == 0)
            {
                result.add(cache);
            }
            return; // backtracking
        }
        for (int i = pos; i < candidates.length; i++) {
            if (i > pos && candidates[i] == candidates[i-1]) {
                continue;
            }
            List<Integer> p = new ArrayList<>(cache);
            p.add(candidates[i]);
            dfs(result,candidates, p,target-candidates[i], i + 1);
        }
    }
    public static void main(String[] args)
    {
        Solution40 solution40 = new Solution40();
        int[] nums = {1,1};
        int target = 1;
        Show.showListListInt(solution40.combinationSum2(nums,target));
    }
}
