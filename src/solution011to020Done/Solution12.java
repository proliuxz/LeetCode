package solution011to020Done;

public class Solution12
{
	public String intToRoman(int num)
	{
		String result = "";
		int t = num/1000;
		int h = (num-t*1000)/100;
		int d = (num-t*1000-h*100)/10;
		int u = num-t*1000-h*100-d*10;
		if (num>0&&num<3999)
		{
			result = 
					numberToRoman(t,'M','*','*') + 
					numberToRoman(h,'C','D','M') + 
					numberToRoman(d,'X','L','C') +
					numberToRoman(u,'I','V','X');
		}
		else
		{
			result = null;
		}
		return result;
	}

	public String numberToRoman(int num, char o, char f, char t)
	{
		String result = "";

		switch (num)
		{
			case 0:
			{
				break;
			}
			case 1:
			{
				result = result + o;
				break;
			}
			case 2:
			{
				result = result + o + o;
				break;
			}
			case 3:
			{
				result = result + o + o + o;
				break;
			}
			case 4:
			{
				result = result + o + f;
				break;
			}
			case 5:
			{
				result = result + f;
				break;
			}
			case 6:
			{
				result = result + f + o;
				break;
			}
			case 7:
			{
				result = result + f + o + o;
				break;
			}
			case 8:
			{
				result = result + f + o + o + o;
				break;
			}
			case 9:
			{
				result = result + o + t;
				break;
			}

		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution12 s12 = new Solution12();
		int target = 10;
		System.out.println(s12.intToRoman(target));
	}

}
