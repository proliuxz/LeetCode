package solution051to060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/9 0009.
 */
public class Solution52 {
    public int totalNQueens(int n) {
        if (n<3)
            return 0;
        return solveNQueens(n).size();
    }

    public List<List<String>> solveNQueens(int n) {
        List result = new ArrayList<>();
        if (n == 0)
            return result;
        else {
            dfs(n, 0, new int[n], new ArrayList<>(), result);
            return result;
        }
    }

    public void dfs(int n, int idx, int[] valid, List<String> path, List<List<String>> ret) {
        if (path.size() == n) {
            ret.add(path);
        }
        for (int j = 0; j < n; j++) {
            if (val(valid, idx, j)) {
                valid[idx] = j;
                String s = String.join("", Collections.nCopies(j, ".")) + "Q" +
                        String.join("", Collections.nCopies(n - j - 1, "."));
                List<String> p = new ArrayList<>(path);
                p.add(s);
                dfs(n, idx + 1, valid, p, ret);
            }
        }
    }

    public boolean val(int[] situation, int n, int pos) {
        for (int i = 0; i < n; i++) {
            if (situation[i] == pos || (n - i) == Math.abs(pos - situation[i])) {
                return false;
            }
        }
        return true;
    }
}
