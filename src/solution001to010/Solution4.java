package solution001to010;

import java.util.Arrays;

public class Solution4 {
    public double findMedianSortedArrays(int A[], int B[]) {
    	int result[] = new int[A.length+B.length];
    	for(int i = 0; i< A.length;i++)
    		result[i] = A[i];
    	for(int j = 0; j< B.length;j++)
    		result[A.length+j] = B[j];
    	Arrays.sort(result);
    	if (result.length==0)
    		return 0;
    	if (result.length==1)
    		return (int) result[0];
    	System.out.println(result.length);
    	System.out.println(result.length%2);
    	if(result.length % 2==1)
    	{
		return (int) result[result.length/2];
    	}
    	else
    	{
    	return (double)((int)result[result.length/2]+(int)result[result.length/2-1])/2;
    	}
    }

	public static void main(String[] args)
	{
		int[] a = {2};
		int[] b = {};
		Solution4 s4 = new Solution4();
		System.out.println(s4.findMedianSortedArrays(a, b));

	}

}
