package solution221to230;

public class Solution223
{

	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H)
	{
		if (C < E || G < A)
			return (G - E) * (H - F) + (C - A) * (D - B);

		if (D < F || H < B)
			return (G - E) * (H - F) + (C - A) * (D - B);

		int right = Math.min(C, G);
		int left = Math.max(A, E);
		int top = Math.min(H, D);
		int bottom = Math.max(F, B);

		return (G - E) * (H - F) + (C - A) * (D - B) - (right - left)
				* (top - bottom);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int A = -3;
		int B = 0;
		int C = 3;
		int D = 4;
		int E = 0;
		int F = -1;
		int G = 9;
		int H = 2;
		Solution223 s223 = new Solution223();
		System.out.println(s223.computeArea(A, B, C, D, E, F, G, H));
	}

}
