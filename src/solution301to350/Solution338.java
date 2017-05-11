package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/3/23 0023.
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        if (num!=0)
        {
            int flag = 0;
            for (int i =1; i<=num;i++)
            {
                result[i] = result[flag]+1;
                flag++;
                if (flag+1>num||result[flag+1]==0)
                    flag=0;
                else
                    flag++;
            }
        }
        return result;
    }
    public static void main(String [] args)
    {
        int x = 127;
        Solution338 s338 = new Solution338();
        int[] nums = s338.countBits(x);
        for (int num :nums
             ) {
            System.out.println(num);
        }
    }
}
