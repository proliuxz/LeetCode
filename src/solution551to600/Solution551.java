package solution551to600;

/**
 * Created by liu.xinzhou on 7/6/2017.
 */
public class Solution551 {
    public boolean checkRecord(String s) {
        return !s.matches(".*(A.*A|LLL).*");
    }

    public static void main(String[] args) {
        Solution551 s551 = new Solution551();
        String s = "PPALLP";
        System.out.print(s551.checkRecord(s));
    }
}
