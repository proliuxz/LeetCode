package solution001to010;

public class Solution7
{
	public int reverse(int x)
	{
		boolean flag = true;
		String sX = Integer.toString(x);
		String result = "";
		int intResult = 0;
		if (sX.charAt(0)=='-')
		{
			flag = false;
			sX = sX.substring(1,sX.length());
		}
		for (int i = 0 ; i<sX.length() ;i++)
		{
			result = result + sX.charAt(sX.length()-i-1);
		}
		double temp = Double.parseDouble(result);
		if (flag==false)
		{
			temp = 0 - temp;
			if (temp<-2147483648)
				return 0;
		}
		else
		{
			if (temp>2147483647)
				return 0;
		}
		intResult = (int) temp;
		return intResult;
	}

	public static void main(String[] args)
	{
		Solution7 s7 = new Solution7 ();
		int target = 1534236469;
		System.out.println(s7.reverse(target));
	}
}