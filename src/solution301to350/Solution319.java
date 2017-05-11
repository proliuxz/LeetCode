package solution301to350;

/**
 * Created by Liu Xinzhuo on 2015/12/20.
 */
public class Solution319 {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    public static  void main(String[] args)
    {
        Solution319 s319 = new Solution319();
        int n = 9;
        System.out.println(s319.bulbSwitch(n));
    }
}
