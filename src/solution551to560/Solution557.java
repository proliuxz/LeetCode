package solution551to560;

/**
 * Created by Liu XZ on 2017/4/10.
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length-1 ; i++) {
            sb.append(new StringBuilder(temp[i]).reverse()+" ");
        }
        sb.append(new StringBuilder(temp[temp.length-1]));
        return sb.toString();
    }
}
