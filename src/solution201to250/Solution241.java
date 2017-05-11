package solution201to250;

import Util.Show;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu Xinzhuo on 2016/4/28 0028.
 * Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.


 Example 1
 Input: "2-1-1".

 ((2-1)-1) = 0
 (2-(1-1)) = 2
 Output: [0, 2]


 Example 2
 Input: "2*3-4*5"

 (2*(3-(4*5))) = -34
 ((2*3)-(4*5)) = -14
 ((2*(3-4))*5) = -10
 (2*((3-4)*5)) = -10
 (((2*3)-4)*5) = 10
 Output: [-34, -14, -10, -10, 10]
 */
public class Solution241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        int num = 0;
        int idx = 0;
        while (idx < input.length()&& Character.isDigit(input.charAt(idx)))
        {
            num *= 10;
            num += input.charAt(idx++) - '0';
        }
        if (idx == input.length())
        {
            result.add(num);
            return result;
        }
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        for (int i = 0; i < input.length(); i++)
        {
            if (!Character.isDigit(input.charAt(i)))
            {
                left = diffWaysToCompute(input.substring(0,i));
                right = diffWaysToCompute(input.substring(i+1,input.length()));

                for (int j = 0; j < left.size() ; j++)
                {
                    for (int k = 0; k <right.size() ; k++)
                    {
                        result.add(computer(left.get(j),right.get(k),input.charAt(i)));
                    }
                }
            }
        }
        return result;
    }
    public int computer(int a, int b, char opt)
    {
        switch (opt)
        {
            case '+':
            {
                return a + b;
            }
            case '-':
            {
                return a - b;
            }
            case '*':
            {
                return a * b;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Solution241 s241 = new Solution241();
        String input = "1+2+3";
        Show.showListInt(s241.diffWaysToCompute(input));
    }
}