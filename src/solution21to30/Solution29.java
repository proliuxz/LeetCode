package solution21to30;

public class Solution29
{
	public int divide(int dividend, int divisor)
	{
		if (divisor==0)
			return 2147483647;
		else if (divisor==1)
			return dividend;
		else if (divisor==-1)
			return -divisor;
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
