import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 8/31/2016.
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

 Note that it is the kth smallest element in the sorted order, not the kth distinct element.

 Example:

 matrix = [
 [ 1,  5,  9],
 [10, 11, 13],
 [12, 13, 15]
 ],
 k = 8,

 return 13.
 */
public class solution371to380 {
    public int kthSmallest(int[][] matrix, int k) {
        int level = (int) Math.sqrt(k);
        int rest = k - level * level;
        if (rest==0)
            return matrix[level-1][level-1];
        int len = Math.min(2*rest,level+1);

        List<Integer> cache = new ArrayList<>();
        for (int i = 0; i < len;i++)
        {
            cache.add(matrix[level][i]);
            cache.add(matrix[i][level]);
        }

        Object[] temp = cache.toArray();
        Arrays.sort(temp);
        return (int) temp[rest-1];
    }
}
