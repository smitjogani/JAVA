import java.util.*;

public class l10{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size");
		int size = sc.nextInt();

//		int[] marks = new int[3]; //first type
//		int marks[] = new int[3];   //second type
		int numbers[]=new int[size];
//		
//		marks[0]=50;
//		marks[1]=40;
//		marks[2]=60;
//		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
		//for input
		for(int i=0;i<size;i++){
			numbers[i] = sc.nextInt();
		}

		System.out.print("Enter value of x:");
		int x = sc.nextInt();

		//for output
		for(int i=0;i<size;i++){
			
			if(numbers[size] == x){
				System.out.print("X is matched");
			}
				
		}

		
	}
}