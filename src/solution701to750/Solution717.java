package solution701to750;

public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length) {
            if(i == bits.length-1)
                return true;
            if(bits[i] == 1)
                i++;
            i++;
        }
        return false;
    }
}
