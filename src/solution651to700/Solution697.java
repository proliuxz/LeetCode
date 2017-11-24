package solution651to700;

import java.util.*;


class NodeWithDistance {
    int count;
    int start;
    int end;
    NodeWithDistance(int pos) {
        count = 1;
        start = pos;
        end = pos;
    }
    public void addPos(int pos) {
        count++;
        if (pos<start)
            start = pos;
        if (pos>end)
            end = pos;
    }
}

public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        if (nums==null||nums.length==0)
            return 0;
        HashMap<Integer, NodeWithDistance> map = new HashMap<Integer, NodeWithDistance>();
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            if(map.containsKey(num))
            {
                NodeWithDistance node = map.get(num);
                node.addPos(i);
            } else {
                map.put(num,new NodeWithDistance(i));
            }
        }

        TreeSet<NodeWithDistance> set = new TreeSet<NodeWithDistance>(new Comparator<NodeWithDistance>() {
            @Override
            public int compare(NodeWithDistance o1, NodeWithDistance o2) {
                return o1.count == o2.count ? (o1.end - o1.start) - (o2.end - o2.start) : o2.count-o1.count;
            }
        });
        for (int key: map.keySet()
             ) {
            set.add(map.get(key));
        }
        NodeWithDistance node = set.first();
        return node.end - node.start + 1;
    }

    public static void main(String[] args) {
        Solution697 s697 = new Solution697();
        int[] nums = {1,2,2,3,1};
        System.out.println(s697.findShortestSubArray(nums));
    }
}