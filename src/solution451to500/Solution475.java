package solution451to500;

import java.util.Arrays;

/**
 * Created by Xinzhuo Liu on 12/13/2016.
 */
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        int j = 0;

        while (i < houses.length) {
            while (j + 1 < heaters.length && Math.abs(heaters[j] - houses[i]) >= Math.abs(heaters[j + 1] - houses[i])) {
                j++;
            }
            radius = Math.max(radius, Math.abs(heaters[j] - houses[i]));
            i++;
        }
        return radius;
    }

    public static void main(String[] args) {
        Solution475 s475 = new Solution475();
        int[] houses = {282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923};
        int[] heaters = {823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729, 823378840, 143542612};
        System.out.println(s475.findRadius(houses, heaters));
    }
}
