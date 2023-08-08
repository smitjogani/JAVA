//reverce the string 

import java.util.Scanner;

public class rec9
{
	public static void reverce(String str,int idx)
	{
		if (idx == 0)
		{
			System.out.println(str.charAt(idx));
			return;
		}
		
		System.out.print(str.charAt(idx));
		reverce(str,idx-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String ✍️: ");
		String str = sc.nextLine();

		reverce(str , str.length()-1);
	}
}