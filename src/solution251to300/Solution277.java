package solution251to300;

public class Solution277 {
    public int findCelebrity(int n) {
        int candidate = 0;
        for(int i = 1; i < n; i++){
            candidate = knows(candidate, i)?i:candidate;
        }

        for(int i = 0; i < n; i++){
            if(i != candidate && (knows(candidate, i) || !knows(i, candidate)))
                return -1;
        }
        return candidate;
    }


    boolean knows(int a, int b) {
        return true;
    }
}
