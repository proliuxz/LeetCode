package solution171to180;

public class Solution171
{
	public int titleToNumber(String s) {
		int result = 0;
		if(s.length()==0||s==null)
			return 0;
        for(int i = 0 ; i < s.length();i++ )
        {
        	result += ((s.charAt(i)-'A'+1)*Math.pow(26,s.length()-i-1));
        	System.out.println(s.charAt(i)+";"+i);
        }
        return result;
    }
	public static void main(String[] args)
	{
		String s = "AB";
		Solution171 s171 = new Solution171();
		System.out.println(s171.titleToNumber(s));
	}
}
