package solution051to100;

public class Solution67
{

	public String addBinary(String a, String b)
	{
		int intA = Integer.parseInt(a, 2);
		int intB = Integer.parseInt(b, 2);
		String result = Integer.toBinaryString(intA+intB);
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution67 s67 = new Solution67();
		String a = "1010";
		String b = "1011";
		System.out.println(s67.addBinary(a, b));
	}

}
