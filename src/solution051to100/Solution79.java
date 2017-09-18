package solution051to100;

/**
 * Created by Liu XZ on 2017/9/17.
 */
public class Solution79 {
    boolean[][] visited;
    int[][] visit = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        boolean result = false;
        for (int[] path : visit
                ) {
            result = result || search(board, word, i + path[0], j + path[1], index + 1);
        }
        if (result) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
