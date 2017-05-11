package solution251to300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 11/29/2016.
 * 293. Flip Game   Add to List QuestionEditorial Solution  My Submissions
 Total Accepted: 16905
 Total Submissions: 31715
 Difficulty: Easy
 Contributors: Admin
 You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.

 Write a function to compute all possible states of the string after one valid move.

 For example, given s = "++++", after one move, it may become one of the following states:

 [
 "--++",
 "+--+",
 "++--"
 ]
 If there is no valid move, return an empty list [].
 */
public class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1)=='+')
            {
                result.add(buildString(s,i));
            }
        }
        return result;
    }

    public String buildString(String s, int pos) {
        StringBuilder sb = new StringBuilder(s);
        sb.replace(pos,pos+2,"--");
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Solution293 s293 = new Solution293();
        String s = "++++";
        List<String> result = s293.generatePossibleNextMoves(s);
        for (String x: result
             ) {
            System.out.println(x);
        }
    }
}
