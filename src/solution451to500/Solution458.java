package solution451to500;

public class Solution458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int rounds = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil((Math.log(buckets)/Math.log(rounds)));
    }
}
