import java.util.*;

public class ch1_p1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter p:");
		int p = sc.nextInt();

		System.out.println("Enter r:");
		double r = sc.nextDouble();

		System.out.println("Enter n(time period):");
		int n = sc.nextInt();

		double rate = (p * r * n)/100;

		System.out.println("The rate is " + rate);
	}
}