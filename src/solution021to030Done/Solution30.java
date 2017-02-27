package solution021to030Done;

import solution001to010Done.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution30
{

	public List<Integer> findSubstring(String s, String[] words)
	{
		List<Integer> result = new ArrayList<Integer>();
		if (s==null||s.length()==0||words.length==0)
		return result;
		int len = words[0].length();
		HashMap<String,Integer> checkMap = new HashMap<String,Integer>();
		for (int i = 0; i <words.length ; i++) {
			checkMap.put(words[i],i);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <s.length(); i = i + len) {
			String sub = s.substring(i, i + len);
			sb.append(checkMap.get(sub));
		}
		System.out.println(sb.toString());
		return result;
	}
	public static void main(String[] args)
	{
		Solution30 s30 = new Solution30();
		String s = "abcdefiiolio";
		String[] words = {"abcd","efii","olio"};
		s30.findSubstring(s,words);
	}

}
