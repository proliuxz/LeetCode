package solution21to30;

public class Solution27
{
	public int removeElement(int[] A, int elem)
	{
		int position = 0 ;
		for(int i = 0 ; i < A.length;i++)
		{
			if(A[i]!=elem)
			{
				A[position] = A[i];
				position++;
			}
		}
		return position;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution27 s27 = new Solution27();
		int elem = 0;
		int[] A = {2,5,46,51,8,35,0,516,0,56,2,0,556,35};
		int result = s27.removeElement(A, elem);
		System.out.println(result);
	}

}
