package solution291to300;

import java.util.HashMap;

/**
 * Created by Liu Xinzhuo on 2015/11/25.
 */
public class Solution299 {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        char[] secretArray = secret.toCharArray();
        char[] guessArray = guess.toCharArray();
        HashMap<Character,Integer> hashMap  = new HashMap<>();

        for (int i = 0; i<guessArray.length;i++)
        {
            if (guessArray[i]==secretArray[i])
            {
                a++;
                guessArray[i] = ' ';
                secretArray[i] = ' ';
            }
        }

        for (int i = 0; i <guessArray.length ; i++)
        {
            if (guessArray[i]!=' ')
            {
                for (int j = 0; j <secretArray.length ; j++)
                {
                    if (guessArray[i]==secretArray[j]&&secretArray[j]!=' ')
                    {
                        b++;
                        guessArray[i] = ' ';
                        secretArray[j] = ' ';
                    }
                }
            }
        }

        return a+"A"+b+"B";
    }
    public void main(String[] args)
    {

    }
}
