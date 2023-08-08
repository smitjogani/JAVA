//2 dimectional array:
//matrix

import java.util.*;

public class 2da{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter rows:");
	int rows = sc.nextInt();

	System.out.println("Enter columns");
	int cols = sc.nextInt();

	int [][] numbers = new int[rows][cols];

	//input
	//control  the row
	for(int i=0;i<=rows;i++){
		//control the columns
		for(int j=0;j<cols;j++){
			numbers[i][j]=sc.nextInt();
		}
	}

	output

	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.println(numbers[i][j] +" ");
		}
	}
	}
}