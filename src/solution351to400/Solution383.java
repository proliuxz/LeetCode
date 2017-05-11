package solution351to400;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 8/31/2016.
 * Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

 Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> cache = new HashMap<>();
        for (int i = 0; i <magazine.length() ; i++) {
            char c = magazine.charAt(i);
            if (!cache.containsKey(c))
                cache.put(c,1);
            else
                cache.put(c,cache.get(c)+1);
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            char x = ransomNote.charAt(i);
            if (cache.containsKey(x)==false)
                return false;
            int num = cache.get(x);
            if (num-1<0)
                return false;
            else
                cache.put(x,num-1);
        }
        return true;
    }
}
