package solution551to600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liu.xinzhou on 28/5/2017.
 */
public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<String>();
        int indexs = Integer.MAX_VALUE;
        HashMap<String,Integer> hs = new HashMap<String, Integer>();
        for (int i = 0; i <list1.length ; i++) {
            hs.put(list1[i],i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (hs.containsKey(list2[i])){
                int tmp = i + hs.get(list2[i]);
                if (tmp<indexs)
                {
                    indexs = tmp;
                    result = new ArrayList<String>();
                    result.add(list2[i]);
                }
                else if (tmp == indexs)
                {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
