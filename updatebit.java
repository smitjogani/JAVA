//update the second bit (position = 1) of the number n to 1. (n = 0101)

import java.util.*;

public class updatebit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int operaction = sc.nextInt();

		int n = 5;
		int pos = 1;
		int bitMask = 1 << pos;
		
		if(operaction == 1)
		{
			//set
			int newNumber = bitMask | n;
			System.out.println(newNumber);
		}
		else
		{
			//clear
			int newBitMask = ~(bitMask);
			int newNumber = newBitMask & n;
			System.out.println(newNumber);
		}
		
	}
}