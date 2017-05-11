package solution401to450;

/**
 * Created by Xinzhuo Liu on 10/27/2016.
 *
 * 415. Add Strings   QuestionEditorial Solution  My Submissions
 Total Accepted: 10165
 Total Submissions: 24438
 Difficulty: Easy
 Contributors: Admin
 Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.

 */
public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuffer sb=new StringBuffer();
        int l1=num1.length();
        int l2=num2.length();
        char[] c1=num1.toCharArray();
        char[] c2=num2.toCharArray();
        int carry=0;
        for (int i = 0; i <l1||i<l2; i++) {
            int a1=i<l1?c1[l1-1-i]-48:0;
            int a2=i<l2?c2[l2-1-i]-48:0;
            int ans=a1+a2+carry;
            sb.append(ans%10);
            carry=ans/10;
        }
        if (carry==1) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution415 s415 = new Solution415();
        String num1 = "99";
        String num2 = "9";
        System.out.println(s415.addStrings(num1,num2));
    }
}
