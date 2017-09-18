package extra;

import java.util.ArrayList;
import java.util.List;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h<0.1){
            return -1;
        }
        if (bounce < 0 || bounce > 1) {
            return -1;
        }
        if (window > h) {
            return -1;
        }
        List<Double> res = new ArrayList<Double>();
        while (h>=window) {
            res.add(h);
            h *= bounce;
        }
        return res.size()*2-1-(res.get(res.size()-1)==window?1:0);
    }

    public static void main(String[] args) {
        show(BouncingBall.bouncingBall(3.0,0.66,1.5));
        show(BouncingBall.bouncingBall(30.0,0.66,1.5));
    }
    private static void show(int num) {
        System.out.println(num);
    }
}
