package solution511to550;

/**
 * Created by Xinzhuo Liu on 5/11/2017.
 */
public class Solution531 {
    public int findLonelyPixel(char[][] picture) {
        int x = picture.length;
        int y = picture[0].length;
        int[] rowCount = new int[x];
        int[] colCount = new int[y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (picture[i][j] == 'B') {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                if (picture[i][j] == 'B' && rowCount[i] == 1 && colCount[j] == 1)
                    count++;
        return count;
    }
}

