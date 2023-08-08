import java.util.*;
public class quections {
	public static void main(String[] args) {
		
		// //1.solid rectangle

		// int a=4;
		// int b=5;

		// //outer loop

		// for (int i=1;i<=a;i++){
			
		// 	//inner loop
		// 	for (int j=1;j<=b;j++){
		// 		System.out.print("*");
		// 	}

		// 	System.out.println("");
		// }

		//2.hollow rectangle

		int c = 4;
		int d = 5;
		//outer loop:
		for(int i=1;i<=c;i++){
			//inner loop:
			for(int j=1;j<=d;j++){
				//cell -> (i,j)
				if(i==1 || j==1 || i==c || j==d){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				System.out.println();
			}
	}


	// //3.half pyramid

	// 	int x = 4;

	// 	for(int i=1;i<=x;i++){
	// 		for(int j=1;j<=i;j++){
	// 			System.out.print("obj");
	// 		}
	// 	}

	// 	//4.invert half pyramid

	// 	int y = 5;

	// 	for(int i=y;i>=1;i--){
	// 		for(int j=1;j<=i;j++){
	// 			System.out.print("*");
	// 		}
	// 		System.out.println(" ");
	// 	}
		
	// 	//5.invert half pyramid(roteted by 180 degree)

	// 	int z=4;
	// 	//outer loop
	// 	for (int i=1;i<=z ;i++ ) {
	// 		//inner loop -> space print
	// 		for(int j=1;j<=z-i;j++){
	// 			System.out.print(" ");
	// 		}
	// 		//inner loop -> star print

	// 		for(int j=1;j<=i;j++){
	// 			System.out.print("*");
	// 		}
	// 		System.out.println(" ");
	// 	}
	// }

	// 	//6.half pyramid with number

	// 	//outer loop
	// 	int s=5;

	// 	for(int i=1;i<=s;i++){
	// 		for(int j=1;j<=i;j++){
	// 			System.out.println(j+" ");
	// 		}
	// 		System.out.println("");
	// 	}
	

	// 	//7.inverted half pyramid with number

	// 	int t = 5;
	// 	for(int i=1;i<=t;i++){
	// 		for(int j=1;j<=t-i+1;j++){
	// 			System.out.print(j +" ");
	// 		}
	// 		System.out.println("");
	// 	}
		

	// 	//8.floyd's triangle

	// 	int v=5;
	// 	int number = 1;
	// 	//outer loop
	// 	for(int i=1;i<=v;i++){
	// 			//inner loop
	// 			for(int j=1;j<=i;j++){
	// 				System.out.print(number +" ");
	// 				number++;//number = number + 1;
	// 			}
	// 			System.out.println();
	// 	}
		

	// 	//9.0-1 triangle

	// 	int n=5;
		

	// 	for(int i=1;i<=5;i++){
	// 		for(int j=1;j<=i;j++){
	// 			int sum=i+j;
	// 			if(sum%2 == 0){
	// 				System.out.print("1 ");
	// 			}
	// 			else{
	// 				System.out.print("0 ");
	// 			}
	// 		}
	// 		System.out.println("");
	// 	}

	}
}