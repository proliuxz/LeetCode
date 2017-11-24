package solution301to350;

import Util.TreeNode;

import java.util.*;

public class Solution314 {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;
        Queue<Dto> queue = new LinkedList<Dto>();
        queue.add(new Dto(root,0));
        while (!queue.isEmpty()) {
            Dto dto = queue.poll();
            TreeNode node = dto.root;
            int pos = dto.position;
            this.addNum(node.val, pos);
            if (node.left!=null)
                queue.add(new Dto(node.left,pos-1));
            if (node.right!=null)
                queue.add(new Dto(node.right,pos+1));
        }
        Integer[] array = map.keySet().toArray(new Integer[0]);
        Arrays.sort(array);
        for (int key: array
             ) {
            res.add(map.get(key));
        }
        return res;
    }

    private void addNum(int number, int pos) {
        ArrayList list = map.getOrDefault(pos, new ArrayList<Integer>());
        list.add(number);
        map.put(pos, list);
    }

    public static void main(String[] args) {
        Solution314 s314 = new Solution314();
        TreeNode tr0 = new TreeNode(0);
        TreeNode tr1 = new TreeNode(1);
        TreeNode tr2 = new TreeNode(2);
        TreeNode tr3 = new TreeNode(3);
        TreeNode tr4 = new TreeNode(4);
        TreeNode tr5 = new TreeNode(5);
        TreeNode tr6 = new TreeNode(6);
        TreeNode tr7 = new TreeNode(7);
        TreeNode tr8 = new TreeNode(8);
        TreeNode tr9 = new TreeNode(9);
        tr3.left = tr9;
        tr3.right = tr8;
        tr9.left = tr4;
        tr9.right = tr0;
        tr8.left = tr1;
        tr8.right = tr7;
        tr0.right = tr2;
        tr1.left = tr5;
        s314.verticalOrder(tr3);
    }
}

class Dto {
    TreeNode root;
    int position;
    Dto(TreeNode root, int position) {
        this.root = root;
        this.position = position;
    }
}