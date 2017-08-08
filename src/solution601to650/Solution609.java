package solution601to650;

import solution001to050.Solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Liu XZ on 2017/7/23.
 */
public class Solution609 {
    HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        for (String path: paths
             ) {
            analysis(path);
        }
        for (String key: map.keySet()
             ) {
            List<String> res = new ArrayList();
            List item = map.get(key);
            if (item.size()>1) {
                for (Object s: item
                        ) {
                    res.add((String) s);
                }
                result.add(res);
            }
        }
        return result;
    }

    private void analysis(String path) {
        String[] lv1 = path.split(" ");
        for (int i = 1; i <lv1.length ; i++) {
            StringBuilder sb = new StringBuilder();
            String[] lv2 = lv1[i].split("\\(");
            sb.append(lv1[0]+"/");
            sb.append(lv2[0]);
            String key = lv2[1].replace(")","");
            List pathList = map.getOrDefault(key,new ArrayList<String>());
            pathList.add(sb.toString());
            map.put(key,pathList);
        }
    }

    public static void main(String[] args) {
        String[] path = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Solution609 s609 = new Solution609();
        s609.findDuplicate(path);
    }
}
