import java.util.*;

public class array{
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);

/*		//1.Take an array of names as input from the user and print them on the screen.

		int size = x.nextInt();

		String[] name = new String[size];

		//input
		for(int i = 0;i<size;i++){
			name[i] = x.next();
		}

		//output
		for(int i=0;i<size;i++){
			System.out.println("Name:" + (i + 1) + "is:" + name[i]);
		}
*/
		//2.Find the maximum & minimum number in an array of integers. 
		
		System.out.print("Enter size:");
		int size = x.nextInt();

		int [] num = new int [size];

		//intput
		for(int i=0;i<size;i++){
			num[i] = x.nextInt();
		}

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;	

		for(int i=0;i<num.length;i++){
			if(num[i] < min){
				min = num[i];
			}

			if(num[i] > max){
				max = num[i];
			}
		}
		System.out.println("Largest number is : " + max);
       	System.out.println("Smallest number is : " + min);

		}
	}