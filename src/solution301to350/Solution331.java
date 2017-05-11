package solution301to350;

/**
 * Created by Liu Xinzhuo on 2016/4/17 0017.
 */
public class Solution331 {
    public boolean isValidSerialization(String preorder) {
        String[] tempPreorder = preorder.split(",");
        int flag = 1;
        for (String s: tempPreorder) {
            if (--flag < 0)
                return false;
            if (!s.equals("#"))
                flag += 2;
        }
        return flag == 0;
    }
    public static void main(String[] args)
    {
        Solution331 s331 = new Solution331();
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println(s331.isValidSerialization(preorder));
    }
}
