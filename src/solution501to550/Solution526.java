package solution501to550;

/**
 * Created by Xinzhuo Liu on 5/11/2017.
 */
public class Solution526 {
    int count = 0;

    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        countArrangementHelper(N, 1, visited);
        return count;
    }

    private void countArrangementHelper(int N, int pos, boolean[] visited) {
        if (pos > N)
            count++;
        for (int i = 1; i < N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                countArrangementHelper(N, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}
