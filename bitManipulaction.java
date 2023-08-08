//GET BIT :-

//Bit Mask : 1 << i
//Operaction : And

// get the thrird bit(position = 2) of a number n.(n = 0101)

public class bitManipulaction
{
	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int bitMask = 1 << pos;

		if((bitMask & n) == 0)
		{
			System.out.println("Bit was zero");
		}
		else 
		{
			System.out.println("Bit was not zero");
		}
	}
}