package solution701to750;

import Util.Show;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if(isDividingNumber(i))
                result.add(i);
        }
        return result;
    }

    private boolean isDividingNumber(int i) {
        int num = i;
        while (num>0)
        {
            int left = num%10;
            num = num/10;
            if (left == 0 || i%left!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int left = 1;
        int right = 22;
        Solution728 s728 = new Solution728();
        Show.showListInt(s728.selfDividingNumbers(left,right));
    }
}
