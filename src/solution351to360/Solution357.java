package solution351to360;

/**
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

 Example:
 Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
 * Created by Xinzhuo Liu on 8/31/2016.
 *
 * DP
 * f(0) = 1
 * f(1) = 9 (1-9)
 * f(2) = 9 * 9 = 81 (0-99 ex 11,22,33,44,55,66,77,88,99)
 * f(3) = f(2) * 8 = 648
 * f(4) = f(3) * 7 = 4536
 * f(5) = 27216
 * f(6) = 136080
 * f(7) = 554320
 * f(8) = 1632960
 * f(9) = 3265920
 * f(10)= 3265920
 * f(11)= 0
 * F(n) = f(n-1) * (10-n+1)
 * return S(n) = f(n)+S(n-1)
 *
 */
public class Solution357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] result = {

                1,10,91,739,5275,32491,168571,712891,2345851,5611771,8877691
        };
        if (n>=11)
            return result[10];
        if (n<0)
            return 0;
        else
            return result[n];
    }
    public static void main(String[] args)
    {
        int[] result = new int[11];
        result[0] = 1;
        result[1] = 9;
        result[2] = 81;
        for (int i = 3; i <11 ; i++) {
            result[i] = result[i-1]*(10-i+1);
            System.out.println(result[i]);
        }
        int[] out = new int[11];
        out[0] = result[0];
        out[1] = result[1]+result[0];
        for (int i = 2; i <result.length ; i++) {
            out[i] = result[i] + out[i-1];
        }
        for (int x:out
             ) {
            System.out.print(x+",");
        }
    }
}
