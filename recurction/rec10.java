//find the first & last occurence of an element in the string

public class rec10
{
	// static variable
	public static int first = -1;
	public static int last = -1;

	//recurcive function
	public static void findOccurence(String str, int index, char element)
	{
		if(index == str.length())
		{
			System.out.println(first);
			System.out.println(last);
		}

		char currChar = str.charAt(index);

		if(first == -1)
		{
			first = index;
		}
		else
		{
			last = index;
		}

		findOccurence(str, index + 1, element);
	}

	public static void main(String[] args) {
		String str = "abaacdaefaah";

		findOccurence(str, 0,'a');
	}
}