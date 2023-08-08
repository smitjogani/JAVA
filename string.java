import java.util.*;

public class string{
	public static void main(String[] args) {
		//string declaraction
		Scanner sc = new Scanner(System.in);

//		String fullname = "smit jogani";
//		String sentence = "My name is smit jogani";

	/*	System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Your name is " +name);
	
		//concattion

		String firstName = "smit";
		String lastName = "jogani";

		String fullName = firstName + " " +lastName;
		System.out.print(fullName.length());

		//charAt

		for(int i=0;i<fullName.length();i++){
			System.out.println(fullName.charAt(i));
		}
		*/

		String name1 = "smit";
		String name2 = "NoSuchMethodExceptiont";

		/*
		comapreTo check three terms:
			1.s1 > s2  return:positive value
			2.s1 == s2	return:zero
			3.s1 < s2	return:nagative value
		

		if(name1.compareTo(name2) == 0){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("String is not equal");
		}



		if(name1 == name2){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("String is not equal");
		}


		if(new String("smit") == new String("smit")){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
*/
		String sentence = "smitJogani";
		//substring(starting index,ending index)
		//from 11 to .....String name = sentence.substring(11,sentence.length());
		String name = sentence.substring(0,4);
		System.out.print(name);
//strings are not editable(immutable).
	}	
}