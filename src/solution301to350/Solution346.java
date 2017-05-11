package solution301to350;

/**
 * Created by Xinzhuo Liu on 11/27/2016.
 */
public class Solution346 {

    int[] window;
    int size;
    int cur;
    int sum;
    int count;

    public Solution346(int size) {
        window = new int[size];
        this.size = size;
    }

    public double next(int val) {
        if(cur >= size)
            cur = 0;
        sum = sum - window[cur] + val;
        window[cur++] = val;
        count++;
        if(count >= size)
            count = size;
        return sum / (double)count;
    }
    public static void main(String[] args) {
        Solution346 s346 = new Solution346(3);
        System.out.println(s346.next(1));
        System.out.println(s346.next(10));
        System.out.println(s346.next(3));
        System.out.println(s346.next(5));
    }
}
