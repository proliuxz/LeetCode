package solution101to150;

import java.util.*;

public class Solution126 {
    List<List<String>> result = new ArrayList<List<String>>();
    HashMap<String,Path> map = new HashMap<String,Path>();
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        ArrayList<String> words = new ArrayList<String>();

        words.addAll(wordList);
        if (!words.contains(beginWord)) {
            words.add(beginWord);
        }

        if (!words.contains(endWord)) {
            words.add(endWord);
        }

        words.add(endWord);
        for (String val: words
             ) {
            map.put(val, new Path(val));
        }
        for (int i = 0; i <words.size()-1 ; i++) {
            for (int j = i+1; j <words.size() ; j++) {
                String a = words.get(i);
                String b = words.get(j);
                if (oneLetterDifferent(a,b)) {
                    map.get(a).addPath(b);
                    map.get(b).addPath(a);
                }
            }
        }
        helper(endWord,beginWord,words,new ArrayList<>());
        return result;
    }

    private void helper(String target, String current, ArrayList<String> words, ArrayList<String> visited) {
        visited.add(current);
        if (current == target) {
            this.result.add(visited);
            return;
        }
        else {
            Path path = map.get(current);
            for (String p: path.paths
                 ) {
                if (!visited.contains(p))
                    helper(target,p,words,visited);
                visited.remove(p);
            }
        }
    }

    private boolean oneLetterDifferent(String a, String b) {
        boolean oneDiffer = false;
        if (a.length()!=b.length())
            return false;
        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                if (oneDiffer == false)
                    oneDiffer = true;
                else {
                    return false;
                }
            }
        }
        return oneDiffer;
    }

    public static void main(String[] args) {
        Solution126 s126 = new Solution126();
        String[] wordList = {"hot","dot","dog","lot","log","cog"};
        String beginWord = "hit";
        String endWord = "cog";
        s126.findLadders(beginWord, endWord, Arrays.asList(wordList));
    }
}

class Path {
    String val;
    HashSet<String> paths;
    Path(String val) {
        paths = new HashSet<>();
        this.val = val;
    }

    public void addPath(String path) {
        this.paths.add(path);
    }
}
