package solution051to060;

public class Solution58
{

	public int lengthOfLastWord(String s)
	{
		int result = 0;
		if(s==null || s.length() == 0)
	        return result;
	 
	    boolean firstSymbol = false;
	    
	    for(int i=s.length()-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	        	firstSymbol = true;
	            result++;
	        }else{
	            if(firstSymbol)
	                return result;
	        }
	    }
	 
	    return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "ilasdjlkfjal;sdj";
		Solution58 s58 = new Solution58();
		System.out.println(s58.lengthOfLastWord(s));
	}

}
