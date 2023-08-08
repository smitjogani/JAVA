import java.util.*;

public class adq{
	public static void main(String [] args){

		//10.Butterfly pattern

		int n=5;

		//outer loop
		//first half -> upper half
		for(int i=1;i<=n;i++){
			//1st part
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//spaces 
			int spaces = 2 * (n-i);

			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}

			//second part:

			for(int j=1;j<=i;j++){
				System.out.print("*");	
			}
			System.out.println("");
		}

		//second half -> lower half

			for(int i=n;i>=1;i--){
			//1st part
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//spaces 
			int spaces = 2 * (n-i);

			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}

			//second part:

			for(int j=1;j<=i;j++){
				System.out.print("*");	
			}
			System.out.println("");
		}

		//11.solid rhombus
		//int n=5;

		//outrer loop
		for(int i=1;i<=n;i++){
			//spaces 
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");		
			}
			//stars

			for(int j=1;j<=5;j++){
				System.out.print("*");			
			}
			System.out.println("");
		}

		//12.number pyramid

		//int n=5;

		for(int i=1;i<=n;i++){

			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			//number -> print row number ,row no. times

			for(int j=1;j<=i;j++){
				System.out.print(i + " ");
			}
			System.out.println("");
		}

		//13.palindromic pyramid

		//int n=5;

		for(int i=1;i<=n;i++){
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			//number -> first half
			for(int j=i;j>=i;j--){
				System.out.print(j +" ");
			}
			//number -> seccond half
			for(int j=2;j<=i;j++){
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		

		//dimond patten

//first part:

		//int n =5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
				System.out.print("*" + " ");
		}
			System.out.println("");
		}
	
//second part

		for(int i=n;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
				System.out.print("*" + " ");
		}
			System.out.println("");
		}
	}
}