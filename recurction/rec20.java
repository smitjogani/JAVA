// Find the number  of ways in which you can invite n people to your party , single or in pairs.

public class rec20
{
	public static int callGuests(int n)
	{
		if(n <= 1)
		{
			return 1;
		}

		//single guest
		int way1 = callGuests(n - 1);

		//pair guests
		int way2 = (n - 1) * callGuests(n - 2);

		return way1 + way2;
	}

	public static void main(String[] args) {
		int n = 33;

		System.out.println(callGuests(n));
	}
}