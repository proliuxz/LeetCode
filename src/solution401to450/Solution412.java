package solution401to450;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 11/2/2016.
 */
public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        if (n==0)
            return result;
        for (int i = 1, flag3 = 1, flag5 = 1; i<=n; i++)
        {
            String temp = "";
            if (flag3==3)
            {
                temp = temp + "Fizz";
                flag3 = 1;
            }
            else flag3++;

            if (flag5==5)
            {
                temp = temp + "Buzz";
                flag5 = 1;
            }
            else flag5++;

            if (temp == "")
            {
                temp = Integer.toString(i);
            }
            result.add(temp);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int n = 1;
        Solution412 s412 = new Solution412();
        for (String s:s412.fizzBuzz(16)
             ) {
            System.out.println(s);
        }
    }
}
