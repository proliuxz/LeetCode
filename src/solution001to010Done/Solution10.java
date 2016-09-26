package solution001to010Done;

public class Solution10
{
	public boolean isMatch(String s, String p)
	{
		if (s==null)
			return p==null;
		
		if (p==null)
			return s==null;
		
		if (p.length()==0)
			return s.length()==0;
		
		if (p.length() == 1)
		{
            if (p.equals(s) || p.equals(".") && s.length() == 1)
                return true;
            else
                return false;
        }

		if (p.charAt(1) == '*') 
		{
			while (s.length() > 0
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'))
            {
                if (isMatch(s, p.substring(2)))
                    return true;
                s = s.substring(1);
            }
            return isMatch(s, p.substring(2));
        } 
		else
		{
			if (s.length() > 0
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) 
            {
                return isMatch(s.substring(1), p.substring(1));
            }
            return false;
        }
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution10 s10 = new Solution10();
		String s = "aa";
		String p = "*aa";
		System.out.println(s10.isMatch(s, p));
	}

}
