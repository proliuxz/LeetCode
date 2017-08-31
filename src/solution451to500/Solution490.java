package solution451to500;

import java.util.LinkedList;
import java.util.Queue;

public class Solution490 {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if (isSamePoint(start[0],start[1],destination[0],destination[1]))
            return true;
        int[][] dirs = new int[][]{{0,-1}, {0,1}, {-1,0}, {1,0}};
        int height = maze.length;
        int width = maze[0].length;
        boolean[][] visited = new boolean[height][width];
        Queue<int[]> queue = new LinkedList< >();
        queue.add(start);
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] s = queue.remove();
            if (isSamePoint(s[0],s[1],destination[0],destination[1]))
                return true;
            for (int[] dir: dirs) {
                int x = s[0] + dir[0];
                int y = s[1] + dir[1];
                while (x >= 0 && y >= 0 && x < height && y < width && maze[x][y] == 0) {
                    x += dir[0];
                    y += dir[1];
                }
                if (!visited[x - dir[0]][y - dir[1]]) {
                    queue.add(new int[] {x - dir[0], y - dir[1]});
                    visited[x - dir[0]][y - dir[1]] = true;
                }
            }
        }
        return false;
    }
    private boolean isSamePoint (int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }
}
