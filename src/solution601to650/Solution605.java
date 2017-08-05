package solution601to650;

/**
 * Created by Liu XZ on 2017/6/10.
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int reuslt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i - 1 == -1 ||flowerbed[i - 1] == 0) && flowerbed[i]==0 &&(i==flowerbed.length-1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                reuslt++;
            }
        }
        return reuslt >= n;
    }
}
