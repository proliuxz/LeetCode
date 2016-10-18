package solution161to170;

/**
 * Created by Liu Xinzhuo on 2016/5/14 0014.
 */
public class Solution166 {
    public String fractionToDecimal(int numerator, int denominator) {
        double result = numerator / denominator;
        String resultString = Double.toString(result);
        String temp[] = resultString.split("\\.");
        if (temp[1]==null)
            return temp[0]+"."+"0";
        int left = 0;
        int right = 1;
        while(right<temp[1].length())
        {
            if (temp[1].substring(left,right).equals(temp[1].substring(right,right*2)))
                return temp[0]+"."+temp[1].substring(left,right);
            else
            {
                left++;
                right += 2;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Solution166 solution166 = new Solution166();
        solution166.fractionToDecimal(1,3);
    }
}
