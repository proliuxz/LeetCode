package solution391to400;

/**
 * Created by Xinzhuo Liu on 10/13/2016.
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s==null||s.length()==0)
            return true;
        for (int i = 0; i <s.length() ; i++) {
            int pos = t.indexOf(s.charAt(i));
            System.out.println(pos);
            if (pos<0)
                return false;
            s = s.substring(pos);
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "acb";
        String t = "ahbgdc";
        Solution392 s392 = new Solution392();
        System.out.println(s392.isSubsequence(s,t));
    }
}
