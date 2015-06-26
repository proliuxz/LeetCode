package solution021to030;

public class Solution26
{
	public int removeDuplicates(int[] A)
	{
		if (A.length==0)
			return 0;
		if (A.length==1)
			return 1;
		int count = 1;
		for (int i = 0 ; i < A.length-1;i++)
		{
			if(A[i]==A[i+1])
				continue;
			else
			{
				A[count] = A[i+1];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution26 s26 = new Solution26();
		int[] A = {1,2,3,4,5,5,5,5,6,7};
		System.out.println(s26.removeDuplicates(A));
	}

}
