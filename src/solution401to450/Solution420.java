package solution401to450;

public class Solution420 {
    public int strongPasswordChecker(String s) {
        int result = 0;
        result += this.lenChecker(s)==false?1:0;
        result += this.caseChecker(s)==false?1:0;
        result += this.repeatChecker(s)==false?1:0;
        return result;
    }

    private boolean lenChecker(String s) {
        return s.length()<=20&&s.length()>=6;
    }

    private boolean caseChecker(String s) {
        int[] sNum = new int[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            sNum[i] = s.charAt(i)-48;
        }
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digital = false;
        for (int num: sNum
             ) {
            if (num >= 0 && num <= 57)
                digital = true;
            else if (num >= 17 && num <= 42)
                upperCase = true;
            else if (num >= 49 && num <= 74)
                lowerCase = true;
        }
        return upperCase&&lowerCase&&digital;
    }

    private boolean repeatChecker(String s) {
        if (s.length()<3)
            return true;
        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2))
                return false;
        }
        return true;
    }
}
