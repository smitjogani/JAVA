//clear the third bit (position = 2) of the number n. (n = 0101)

import java.util.*;

public class clearbit
{
	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int bitMask = 1 << pos;
		int notBitmask = ~(bitMask);

		int newNumber = notBitmask & n;
		System.out.println(newNumber);
	}
}