//print sum of n natural numbers

import java.util.*;

public class rec3
{
	public static void printSum(int i, int n, int sum)
	{
		if (i == n)
		{
			sum += i; // add the value of i in sum 
			System.out.println("Sum " + n + " number is " + sum); //print the sum
			return;
		}

		sum += i;
		printSum(i + 1, n , sum);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n : ");
		int n = sc.nextInt(); //get input from user

		printSum(1, n, 0);//call the sum function
	}
}