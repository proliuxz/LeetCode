package solution551to600;

import Util.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by liu.xinzhou on 16/6/2017.
 */
public class Solution582 {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,TreeNode> map = new HashMap<Integer , TreeNode>();
        for (int i = 0; i <ppid.size() ; i++) {
            int ppidInt = ppid.get(i);
            int pidInt = pid.get(i);
            if (!map.containsKey(ppidInt)) {
                map.put(ppidInt, new TreeNode(ppidInt));
            }
            if (!map.containsKey(pidInt)) {
                map.put(pidInt, new TreeNode(pidInt));
            }
            map.get(ppidInt).children.add(map.get(pidInt));
        }
        if (!map.containsKey(kill))
            return result;
        TreeNode node = map.get(kill);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(new TreeNode(kill));
        while (stack.size()!=0)
        {
            int cur = stack.pop().val;
            result.add(cur);
            TreeNode curTree = map.get(cur);
            List next = curTree.children;
            if (next.size()!=0){
                stack.addAll(next);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution582 s582 = new Solution582();
        List<Integer> pid= new ArrayList<Integer>();
        pid.add(1);
        pid.add(3);
        pid.add(10);
        pid.add(5);

        List<Integer> ppid= new ArrayList<Integer>();
        ppid.add(3);
        ppid.add(0);
        ppid.add(5);
        ppid.add(3);

        int kill =5;
        Show.showListInt(s582.killProcess(pid,ppid,kill));
    }
}

class TreeNode {
    public int val;
    public List<TreeNode> children;
    TreeNode(int x) {
        val = x;
        children = new ArrayList<TreeNode>();
    }
}