// print all the unique subsequences of the string

import java.util.*;

public class rec15
{
	public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set)
	{

		if(idx == str.length())
		{
			if(set.contains(newString))
			{
				return;
			}
			else
			{
				System.out.println("-->" + newString);
				set.add(newString);
				return;	 
			}
		}

		char currChar = str.charAt(idx);

		//to be 
		uniqueSubSequences(str, idx + 1, newString + currChar, set);

		//not to be
		uniqueSubSequences(str, idx + 1, newString, set);
	}

	public static void main(String[] args) {
		String str = "aaa";

		//HashSet is one of the datastructure
		HashSet<String> set = new HashSet<>();
		
		uniqueSubSequences(str, 0, "", set);
	}
}