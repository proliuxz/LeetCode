package solution451to500;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Xinzhuo Liu on 5/11/2017.
 */
public class Solution496 {
    //    public int[] nextGreaterElement(int[] findNums, int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] < nums[j]) {
//                    hm.put(nums[i], nums[j]);
//                    break;
//                }
//            }
//        }
//        int[] result = new int[findNums.length];
//        for (int i = 0; i < findNums.length; i++) {
//            result[i] = hm.containsKey(findNums[i]) ? hm.get(findNums[i]): -1;
//        }
//        return result;
//    }
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int result[] = new int[findNums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                hm.put(stack.pop(), nums[i]);
            }
            stack.add(nums[i]);
        }
        while (!stack.isEmpty()) {
            hm.put(stack.pop(), -1);
        }
        for (int i = 0; i <findNums.length ; i++) {
            result[i] = hm.get(findNums[i]);
        }
        return result;
    }
}
