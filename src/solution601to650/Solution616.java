package solution601to650;

public class Solution616 {
    public String addBoldTag(String s, String[] dict) {
        boolean[] flag = new boolean[s.length()];
        for (String d: dict) {
            for (int i = 0; i <= s.length() - d.length(); i++) {
                if (s.substring(i, i + d.length()).equals(d)) {
                    for (int j = i; j < i + d.length(); j++)
                        flag[j] = true;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (flag[i]) {
                res.append("<b>");
                while (i < s.length() && flag[i])
                    res.append(s.charAt(i++));
                res.append("</b>");
            } else
                res.append(s.charAt(i++));
        }
        return res.toString();
    }
}
