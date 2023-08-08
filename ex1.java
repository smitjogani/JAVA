
import java.util.*;

public class ex1{

	/*public static float average(int a,int b,int c){
		return (a + b + c)/3;
	}

	public static int sum(){
		return 1+3+5+7+9;
	}
	
	public static int greaterNum(int m,int n){
		if(m>n){
			return m;
		}
		else{
			return n;
		}
	}
	
	public static double red(double r){
		return Math.PI*2*r;
	}
	
	public static void vote(int age){
		if(age > 18){
			 System.out.print("you are eligible for vote");
		}
		else{
			System.out.print("you are not eligible for vote");
		}
	}
	
 	public static int power(int x, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(x, n / 2) * power(x, n / 2);
        else
            return x * power(x, n / 2) * power(x, n / 2);
    }
  
    public static int pnz(int k){
    	if(k==0){
    		System.out.print("Zero");
    		return 0;
    	}
    	else if(k<0){
    		System.out.print("Nagative");
    		return 0;
    	}
    	else{
    		System.out.print("Positive");
    		return 0;	
    	}
    }

    static int n1=0,n2=1,n3=0;

    static void printFibonacci(int count){

		if(count>0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			printFibonacci(count - 1);
		}
    }
*/
    
	public static void main(String [] args){
		Scanner ab = new Scanner(System.in);

		/*p-1:
		Enter three numbeer from user and make function their 
		print their average.

		int a = ab.nextInt();
		int b = ab.nextInt();
		int c = ab.nextInt();

		float average = average(a,b,c);
		System.out.print("average of three number is " + average);
		
		*/

		/*p-2:
		write a function to print sum of all odd number from 1 to 10
		
		int sum = sum();
		System.out.print("Sum of odd number from 1 to 10 is " + sum);
		*/

		/*p-3:
		Write a function th t takes two nubers and return the greater those two.
		
		int m = ab.nextInt();
		int n = ab.nextInt();
		int gtValue = greaterNum(m,n);
		System.out.print("The greater number is " + gtValue);
		*/

		/*p-4:
		write function that takes in the radius as input and returns as input and returns
		the circumference of a circle.	
		
		System.out.print("Enter radius:");
		double r = ab.nextDouble();
		double cir = red(r);
		System.out.print("circumference of circle is " +cir);
		*/

		/*p-5:
		write a function that takes in age as input and return if that person eligible 
		for what or not.
		
		incomplate

		System.out.print("Enter age:");
		int age = ab.nextInt();

		int eligible = vote(age);
		System.out.print(eligible);
		*/

		/*p-6
		two numbers are entered by user x and n.write the function to find the value
		of one raised to the power of another.
		
		System.out.print("Enter value of x:");
		int x = ab.nextInt();

		System.out.print("Enter value of n:");
		int n = ab.nextInt();

		 System.out.printf("%d", power(x, n));
		 */

		 /*p-7:
			Write program to enter the numbers till the user wants and at the end 
			it should display te nagative,positive and zero.
		 
		
	 	System.out.print("Enter value:");
		int k = ab.nextInt();

		int a = pnz(k);
		System.out.print(a);
	*/
		/*p-9:
		fibonaki series
		
		
		System.out.print("Enter value of count:");
		int count = ab.nextInt();

		System.out.print(n1+""+ n2);
		printFibonacci(count - 2);
		*/


	}
}