package solution351to400;

/**
 * Created by Xinzhuo Liu on 12/12/2016.
 */
public class Solution374 {
    public int guessNumber(int n) {
        int i = 1, j = n;
        while(i < j) {
            int mid = i + ((j - i) >> 2);
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public int guess(int num)
    {
        int target =5;
        if (num>target)
            return 1;
        if (num<target)
            return -1;
        return 0;
    }
    public static void main(String[] args)
    {
        Solution374 s374 = new Solution374();
        System.out.println(s374.guessNumber(20));
    }
}
