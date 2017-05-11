package solution051to100;

public class Solution59
{
	public int[][] generateMatrix(int n)
	{
		int[][] result = new int[n][n];
		if(n==0)
			return result;
		int levelNum = n/2;
	    int num = 1;
	    for(int l=0;l<levelNum;l++)
	    {
	        for(int i=l;i<n-l;i++)
	        {
	            result[l][i] = num++;
	        }
	        for(int i=l+1;i<n-l;i++)
	        {
	            result[i][n-1-l] = num++;
	        }
	        for(int i=n-2-l;i>=l;i--)
	        {
	            result[n-1-l][i] = num++;
	        }
	        for(int i=n-2-l;i>l;i--)
	        {
	            result[i][l] = num++;
	        }
	    }
	    if(n%2==1)
	    {  
	        result[levelNum][levelNum] = num;
	    }
	    return result;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution59 s59 = new Solution59();
		int n = 5;
		int[][] result = new int[n][n];
		result = s59.generateMatrix(n);
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 5; j++)
				System.out.print(result[i][j]+",");
			System.out.println();
		}
	}

}
