package solution001to010Done;

/**
 * Created by Liu Xinzhuo on 2016/5/20 0020.
 */
public class Solution {
    public int findOddNum(int[] A)
    {
        int odd = 0;
        int even = 0;
        for(int temp:A)
        {
            if (temp%2==0)
                even++;
            else
                odd++;
        }
        return odd*(odd-1)/2+even*(even-1)/2;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] A = {8, 24, 3, 20, 1, 17};
        System.out.println(solution.findOddNum(A));
    }
}
