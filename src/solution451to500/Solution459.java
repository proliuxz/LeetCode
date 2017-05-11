package solution451to500;

/**
 * Created by Xinzhuo Liu on 11/22/2016.
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String str) {
        if(str.length() < 2)
            return false;
        int i = 1;
        boolean flag = false;
        while(i <= (str.length()>>1))
        {
            if(str.length() % i ==0) {
                if (check(str,i))
                    return true;
            }
            i++;
        }
        return false;
    }


    public boolean check(String str,int distance){
        for(int i = distance; i < str.length(); i+= distance){
            for(int j = 0; j < distance;j ++)
                if(str.charAt(i + j) != str.charAt(j))
                    return false;;
        }
        return true;
    }
}
