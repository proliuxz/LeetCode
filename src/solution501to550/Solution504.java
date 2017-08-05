package solution501to550;

/**
 * Created by Liu XZ on 2017/6/4.
 */
public class Solution504 {
    public String convertToBase7(int num) {
        int left = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (true)
        {
            if(Math.abs(left)<7)
            {
                sb.append(left);
                if (num<0)
                    sb.append("-");
                return sb.reverse().toString();
            }
            sb.append(left%7);
            left = left/7;
        }
    }
}
