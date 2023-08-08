//print keypad combinations

import java.util.*;

public class rec16
{
	public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	public static void prnitCombination(String str, int idx, String combination)
	{
		if(idx == str.length())
		{
			System.out.println(combination);
			return;
		}

		char currChar = str.charAt(idx);

		String mapping = keypad[currChar - '0'];

		for(int i = 0; i < mapping.length(); i++) 
		{
			prnitCombination(str, idx + 1, combination + mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Keypad number : ");
		String str = sc.nextLine();

		prnitCombination(str, 0, "");
	}
}