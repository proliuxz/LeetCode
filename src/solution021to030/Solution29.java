package solution021to030;

public class Solution29
{
	public int divide(int dividend, int divisor)
	{
		long a = Math.abs((long)dividend);  
        long b = Math.abs((long)divisor);
        long res = 0;  
			  while(a >= b)  
		        {  
		            long c = b;  
		            for(int i = 0; a >= c; i++, c <<=1)  
		            {  
		                a -= c;  
		                res += 1<<i;  
		            }  
		        }  
		        return ((((dividend^divisor)>>31)<0) ? ((int) -res) : ((int) res));  
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
