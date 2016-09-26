package solution301to310;

import Util.Show;

import java.util.*;

/**
 * Created by Liu Xinzhuo on 2016/5/27 0027.
 */
public class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        HashMap<Integer,Node> nodes = new HashMap<>();
        for (int i = 0;i<n;i++)
        {
            Node node = new Node(i);
            nodes.put(i,node);
        }
        for(int[] temp : edges)
        {
            nodes.get(temp[0]).nodes.add(temp[1]);
            nodes.get(temp[1]).nodes.add(temp[0]);
        }
        while (nodes.size()>2)
        {
            findDelOneDegreeNodes(nodes);
        }
        List result = new ArrayList<>();
        for (Integer key:nodes.keySet())
        {
            result.add(key);
        }
        return result;
    }

    public void findDelOneDegreeNodes(HashMap<Integer,Node> nodes)
    {
        HashMap<Integer,Node> oneDegreeNodes = new HashMap();
        for (Integer key: nodes.keySet())
        {
            Node node = nodes.get(key);
            if (node.nodes.size()==1)
                oneDegreeNodes.put(key,node);
        }

        for (Integer key:oneDegreeNodes.keySet())
        {
            Node node = nodes.get(key);
            nodes.remove(key);
            int rootNum;
            for(Iterator<Integer> itor = node.nodes.iterator();itor.hasNext(); )
            {
                rootNum = itor.next();
                nodes.get(rootNum).nodes.remove(node.num);
            }
        }
    }

    class Node
    {
        int num;
        HashSet<Integer> nodes;

        Node(int x)
        {
            this.num = x;
            nodes = new HashSet<>();
        }
    }

    public static void main(String[] args)
    {
        int n = 4;
        int[][] edges = {{1,0},{1,2},{1,3}};
        Solution310 solution310 = new Solution310();
        Show.showListInt(solution310.findMinHeightTrees(n,edges));
    }
}
