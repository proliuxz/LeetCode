package solution101to150;

import java.util.ArrayList;
import java.util.List;

public class Solution120
{

	public int minimumTotal(List<List<Integer>> triangle)
	{
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList();
		List<Integer> l2 = new ArrayList();
		List<Integer> l3 = new ArrayList();
		List<Integer> l4 = new ArrayList();
		l1.add(2);
		l2.add(3);
		l2.add(4);
		l3.add(6);
		l3.add(5);
		l3.add(7);
		l4.add(4);
		l4.add(1);
		l4.add(8);
		l4.add(3);
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(l1);
		triangle.add(l2);
		triangle.add(l3);
		triangle.add(l4);
		Solution120 s120 = new Solution120();
		System.out.println(s120.minimumTotal(triangle));
	}	

}
