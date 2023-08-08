//Functions and methods:
//factorial

import java.util.*;

public class l7{

	public static void factorial(int n){
		int fact = 1;

		if(n<0){
			System.out.print("Invalid input :)");
		}
		else if(n==0){
			System.out.print("1");
		}
		else{
			for(int i=n;i>=1;i--){
				fact = fact * i;
			}
			System.out.print(fact);
			return;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		factorial(n);
	}
}