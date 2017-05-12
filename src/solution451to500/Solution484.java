package solution451to500;

import Util.Show;

/**
 * Created by Xinzhuo Liu on 5/12/2017.
 */
public class Solution484 {
    public int[] findPermutation(String s) {
        int len = s.length();
        int[] result = new int[len + 1];
        result[0] = 1;
        int decreaseCnt = 0;
        for (int i = 0; i < len; i++, decreaseCnt++)
        {
            result[i+1] = i + 2;
            if (s.charAt(i) == 'I')
            {
                Reverse(result, i - decreaseCnt, i);
                decreaseCnt = -1;
            }
        }
        Reverse(result, result.length - 1 - decreaseCnt, result.length - 1);
        return result;
    }

    public void Reverse(int[] arr, int i, int j)
    {
        int temp = 0;
        for (; i < j; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main (String[] args) {
        Solution484 s484 = new Solution484();
        String s = "DDIIDI";
        Show.showArray(s484.findPermutation(s));
    }
}
