package solution201to250;

public class Solution231
{

	public boolean isPowerOfTwo(int n)
	{
		return (n <= 0) ? false : ((n & (n - 1)) == 0);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution231 s231 = new Solution231();
		int n1 = 1024;
		int n2 = 2048;
		int n3 = 1999;
		System.out.println(s231.isPowerOfTwo(n1));
		System.out.println(s231.isPowerOfTwo(n2));
		System.out.println(s231.isPowerOfTwo(n3));
	}

}
