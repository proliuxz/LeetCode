package solution201to250;

public class Solution204
{
	public int countPrimes(int n)
	{
		if (n < 2)
			return 0;
		boolean[] primes = new boolean[n];
		for (int i = 2; i < n; i++)
			primes[i] = true;
		for (int i = 2; i <= Math.sqrt(n - 1); i++)
		{
			if (primes[i])
			{
				for (int j = i + i; j < n; j += i)
					primes[j] = false;
			}
		}

		int count = 0;
		for (int i = 2; i < n; i++)
		{
			if (primes[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n1 = 2;
		int n2 = 99;
		Solution204 s204 = new Solution204();
		System.out.println(s204.countPrimes(n1));
		System.out.println(s204.countPrimes(n2));
	}

}
