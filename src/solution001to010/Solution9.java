package solution001to010;

public class Solution9 {
    public boolean isPalindrome(int x) {
        String sX = Integer.toString(x);
        int left = 0;
    	int right = sX.length() - 1;
        if (sX.length()%2==0)
        {
        	while (left-1!=right)
        	{
        		if (sX.charAt(left)!=sX.charAt(right))
        			return false;
        		left++;
        		right--;
        	}
        	return true;
        }
        else
        {
        	while (left != right)
        	{
        		if (sX.charAt(left)!=sX.charAt(right))
        			return false;
        		left++;
        		right--;
        	}
        	return true;
        }
    }

	public static void main(String[] args)
	{
		Solution9 s9 = new Solution9();
		int x = -2147483648;
		System.out.println(s9.isPalindrome(x));

	}

}
