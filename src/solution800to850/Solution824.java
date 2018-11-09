package solution800to850;

public class Solution824 {
    public String toGoatLatin(String S) {
        if (S.isEmpty())
            return S;
        String vowel = "aeiouAEIOU";
        String[] strings = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length ; i++) {
            String st = strings[i].substring(0,1);
            String se = strings[i].substring(1);
            if (vowel.contains(st))
            {
                sb.append(strings[i]);
            }
            else
            {
                sb.append(se);
                sb.append(st);
            }
            sb.append("ma");
            int x = i + 1;
            while (x>0)
            {
                sb.append("a");
                x--;
            }
            if (i!=strings.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Solution824 s824 = new Solution824();
        String result = s824.toGoatLatin("The quick brown fox jumped over the lazy dog");
        System.out.println(result);
    }
}
