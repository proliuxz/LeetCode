package solution391to400;

import Util.Show;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Xinzhuo Liu on 10/18/2016.
 */
public class Solution399 {
    HashMap nodeList = new HashMap<String,Node>();
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        return null;
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
