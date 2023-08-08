//2 dimectional array:

import java.util.*;

public class twoDimectional{
	public static void main(String args[]){
	Scanner vc = new Scanner(System.in);
	System.out.print("Enter rows:");
	int rows = vc.nextInt();

	System.out.print("Enter columns");
	int cols = vc.nextInt();

	int [][] numbers = new int[rows][cols];

	//input
	//control  the row
	for(int i=0;i<=rows;i++){
		//control the columns
		for(int j=0;j<cols;j++){
			numbers[i][j]=vc.nextInt();
		}
	}

	System.out.print("Enter x:");
	int x = vc.nextInt();


	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			if(numbers[i][j]==x){
				System.out.print("x is found at location("+ i +","+ j +")");
			}
		}
	}
	}
}	