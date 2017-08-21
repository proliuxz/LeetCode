package solution651to700;

/**
 * Created by liu.xinzhou on 15/8/2017.
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int[] res = new int[2];
        for (char s: moves.toCharArray()
             ) {
            switch (s){
                case 'U': res[0]++; break;
                case 'D': res[0]--; break;
                case 'L': res[1]++; break;
                case 'R': res[1]--; break;
            }
        }
        return res[0]==0&&res[1]==0;
    }
}
