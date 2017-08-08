package solution501to550;

/**
 * Created by Liu XZ on 2017/5/7.
 */
public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        String[] aString = a.split("\\+");
        String[] bString = b.split("\\+");
        StringBuilder sb = new StringBuilder();
        sb.append(format(aString[0])*format(bString[0])-format(aString[1])*format(bString[1]));
        sb.append("+");
        sb.append(format(aString[0])*format(bString[1])+format(aString[1])*format(bString[0]));
        sb.append("i");
        return sb.toString();
    }

    private int format(String s) {
        return Integer.parseInt(s.replace("i",""));
    }
}
