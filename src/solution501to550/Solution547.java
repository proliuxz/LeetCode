package solution501to550;

/**
 * Created by liu.xinzhou on 2/6/2017.
 */
public class Solution547 {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int result = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                result++;
            }
        }
        return result;
    }
    public void dfs (int[][] M,int[] visited, int i ) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
}
