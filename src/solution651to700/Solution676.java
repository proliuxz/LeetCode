package solution651to700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Liu XZ on 2017/9/10.
 */
public class Solution676 {
    HashMap<Integer,List<String>> map;
    public Solution676() {
        map = new HashMap<Integer,List<String>>();
    }

    public void buildDict(String[] dict) {
        for (String word: dict
             ) {
            List list = map.getOrDefault(word.length(),new ArrayList<String>());
            list.add(word);
            map.put(word.length(),list);
        }
    }

    public boolean search(String word) {
        if(!map.containsKey(word.length()))
            return false;
        List<String> list = map.get(word.length());
        for (String dicWord: list
             ) {
            if (isModifiedOneWord(dicWord,word))
                return true;
        }
        return false;
    }

    private boolean isModifiedOneWord(String a, String b) {
        if(a.length()!=b.length())
            return false;
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i))
                cnt++;
        }
        return cnt == 1;
    }

    public static void main(String[] args){
        Solution676 s676 = new Solution676();
        String[] dist = {"hello","leetcode"};
        s676.buildDict(dist);
        System.out.println(s676.search("hello"));
        System.out.println(s676.search("hhllo"));
        System.out.println(s676.search("hell"));
        System.out.println(s676.search("leetcoded"));
    }
}
