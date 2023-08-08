//print fibonacci series in nth term

import java.util.*;

public class rec5
{
	public static void fibonacci(int a, int b, int n)
	{
		if (n == 0)
		{
			return;
		}
		int c = a + b;
		System.out.println(c);

		fibonacci(b, c, n -1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 1;

		System.out.println("Enter theh value of n:");
		int n = sc.nextInt();

		System.out.println(a);
		System.out.println(b);

		fibonacci(a, b, n - 2);
	}
}