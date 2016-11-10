package solution391to400;

import Util.Show;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 10/18/2016.
 */
public class Solution399 {
    HashMap nodeList = new HashMap<Character,Node>();
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        double[] result = new double[values.length];
        for (int i = 0; i < equations.length ; i++) {
            Node node1 = getNode(equations[i][0]);
            Node node2 = getNode(equations[i][1]);
            binding(node1,node2,values[i]);
        }
        for (int i = 0; i <queries.length ; i++) {
            if (!nodeList.containsKey(queries[i][0]))
                result[i] = -1;
            else
                result[i] = findPath();
        }
        return null;
    }

    public double findPath()
    {
        return 0;
    }

    public void binding (Node n1, Node n2, double d)
    {
        addNode(n1);
        addNode(n2);
        if (!n1.next.containsKey(n2)){
            n1.next.put(n2.s,d);
            n2.next.put(n1.s,(1/d));
        }
    }

    public Node getNode(String s)
    {
        if(nodeList.get(s)!=null)
            return (Node) nodeList.get(s);
        else
        {
            Node node = new Node(s);
            nodeList.put(s,node);
            return node;
        }
    }

    public void addNode(Node node)
    {
        if (!nodeList.containsKey(node))
            nodeList.put(node.s,node);
    }

    public static void main(String[] args)
    {
        Solution399 s399 = new Solution399();
        String[][] equations = { {"a", "b"}, {"b", "c"} };
        double[] values = {2.0, 3.0};
        String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
        Show.showArray(s399.calcEquation(equations,values,queries));
    }
}

class Node {
    String s;
    HashMap<String,Double> next;
    Node(String s)
    {
        this.s = s;
        this.next = new HashMap<String,Double>();
    }
}
