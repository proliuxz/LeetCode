package solution051to100;

import java.util.HashMap;

public class Solution76 {
    public String minWindow(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = s.toCharArray();
        int len = charT.length;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c: charT
             ) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left = 0;
        int count = 0;
        int minLen = charS.length+1;
        int minStart = 0;
        for(int right=0; right<charS.length;right++)
        {
            if(map.containsKey(charS[right]))
            {
                map.put(charS[right],charS[right]-1);
                if(map.get(charS[right])>=0)
                {
                    count++;
                }
                while(count == charT.length)
                {
                    if(right-left+1<minLen)
                    {
                        minLen = right-left+1;
                        minStart = left;
                    }
                    if(map.containsKey(charS[left]))
                    {
                        map.put(charS[left], map.get(charS[left])+1);
                        if(map.get(charS[left])>0)
                        {
                            count--;
                        }
                    }
                    left++;
                }
            }
        }
        if(minLen>s.length())
        {
            return "";
        }
        return s.substring(minStart,minStart+minLen);
    }
}
