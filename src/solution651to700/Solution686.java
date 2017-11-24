package solution651to700;

public class Solution686 {
    public int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B))
            return count;
        if(sb.append(A).toString().contains(B))
            return count+1;
        return -1;
    }

    public static void main(String[] args) {
        String A = "abcd";
        String B = "cdabcdab";
        Solution686 s686 = new Solution686();
        System.out.println(s686.repeatedStringMatch(A,B));
    }
}
