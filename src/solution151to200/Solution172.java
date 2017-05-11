package solution151to200;

public class Solution172
{

	public int trailingZeroes(int n)
	{
		if (n < 0)
			return -1;
	 
		int count = 0;
		for (long i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution172 s172 = new Solution172();
		int n = 20;
		System.out.println(s172.trailingZeroes(n));
	}

}
