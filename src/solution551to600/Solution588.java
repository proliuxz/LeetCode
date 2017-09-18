package solution551to600;

import java.util.*;

public class Solution588 {
    Dic root;

    public Solution588() {
        root = new Dic();
    }

    public List<String> ls(String path) {
        return root.ls(path,0, root);
    }

    public void mkdir(String path) {
        String[] paths = path.split("/");
        root.addDic(paths,0);
    }

    public void addContentToFile(String filePath, String content) {
        String[] paths = filePath.split("/");
        root.addFile(paths,0, content);
    }

    public String readContentFromFile(String filePath) {
        String[] paths = filePath.split("/");
        return root.getFile(paths,0,root);
    }

    public static void main(String[] args) {
        Solution588 s588 = new Solution588();
        s588.ls("/");
        s588.mkdir("a/b/c");
        s588.addContentToFile("a/b/c/d","Hello!");
        s588.ls("/");
        System.out.println(s588.readContentFromFile("a/b/c/d"));
    }
}

class Dic {
    public Map<String, Dic> dics;
    public Map<String, String> files;

    Dic() {
        dics = new HashMap<String, Dic>();
        files = new HashMap<String, String>();
    }

    Dic(HashMap<String, Dic> dics, HashMap<String, String> files) {
        this.files = files;
        this.dics = dics;
    }

    public void addDic(String[] paths, int cur) {
        if (cur == paths.length-1)
            dics.put(paths[cur], new Dic());
        else {
            if (!dics.containsKey(paths[cur]))
                dics.put(paths[cur],new Dic());
            dics.get(paths[cur]).addDic(paths,cur+1);
        }
    }

    public void addFile(String[] paths, int cur, String content) {
        if (cur == paths.length-1)
            files.put(paths[cur], content);
        else {
            if (!dics.containsKey(paths[cur]))
                dics.put(paths[cur],new Dic());
            dics.get(paths[cur]).addFile(paths,cur+1,content);
        }
    }

    public List<String> ls(String path, int cur, Dic dic) {
        String[] paths = path.split("/");
        if (paths.length==0)
            return new ArrayList<>(dic.dics.keySet());
        if (paths.length-1!=cur)
            return ls(path, cur+1, dic.dics.get(paths[cur]));
        if (isDic(path))
            return new ArrayList<>(dic.dics.keySet());
        else
            return new ArrayList<>(dic.files.keySet());
    }

    public String getFile(String[] paths, int cur, Dic dic) {
        if (paths.length-1!=cur)
            return getFile(paths, cur+1, dic.dics.get(paths[cur]));
        else
            return dic.files.get(paths[cur]);
    }
    private boolean isDic(String path) {
        return path.charAt(path.length()-1) == '/';
    }
}
