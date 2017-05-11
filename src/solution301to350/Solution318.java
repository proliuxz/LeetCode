package solution301to350;

/**
 * Created by Liu Xinzhuo on 2015/12/20.
 */
public class Solution318 {
    public int maxProduct(String[] words) {
        int result = 0;
        int len = words.length;
        int tran[] = new int[len];

        for (int i=0;i<len;i++)
        {
            for(int j=0;j<words[i].length();j++){
                tran[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }

        for (int m = 0 ; m <len; m++)
        {
            for (int n = m+1 ; n<len; n++)
            {
                result= (((tran[n] & tran[m]) == 0)? Math.max(result, words[m].length()*words[n].length()):result);
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Solution318 s318 = new Solution318();
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(s318.maxProduct(words));

    }
}
