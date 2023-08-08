//place tiles of size 1xm in a flore of size nxm

public class rec19
{
	public static int placeTiles(int n, int m)
	{
		if(n == m)
		{
			return 2;
		}

		if(n < m)
		{
			return 1;
		}

		//vertically
		int vertPlacement = placeTiles(n - m, m);

		//Horizontally
		int horPlacement = placeTiles(n - 1, m);

		return vertPlacement + horPlacement;
	}

	public static void main(String[] args) {
		int n = 4, m = 2;
		System.out.println(placeTiles(n, m));
	}
}