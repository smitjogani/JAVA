//print the factorial of the number n

import java.util.*;

public class rec4
{
	public static int fact(int n) 
	{
		if(n == 1 || n == 0)
		{
			return 1;
		}
		int fact_nm1 = fact(n - 1);	
		int fact_n = n * fact_nm1;
		
		return fact_n;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();

		System.out.println("The factorial of " + n + " is "+ fact(n));
	}
}