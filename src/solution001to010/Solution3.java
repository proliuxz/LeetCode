package solution001to010;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    	int left = 0;
    	int right = 0;
       	int result = 0;
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	for(right = 0; right< s.length();)
    	{
    		if (hm.containsKey(s.charAt(right)))
    		{
    			result = Math.max(result, right - left);
    			while(s.charAt(left)!=s.charAt(right))
    			{
    				hm.remove(s.charAt(left));
    				left++;
    			}
    			left++;
    		}
    		else
    		{
    			hm.put(s.charAt(right), right);
    		}
    		right++;
    	}
		result = Math.max(result, right - left);
		return result;
    }
    
	public static void main(String[] args)
	{
		String s = "aa";
		Solution3 s3 = new Solution3();
		int result = s3.lengthOfLongestSubstring(s);

		System.out.println(result);
	}
}

