// calculate average using arrays

import java.util.*;

public class avg_arr11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the nummber of elements you want to store :");
    int ne = sc.nextInt();

    double[] numArray = new double[ne];
    
    double sum = 0.0;

    System.out.println("Enter the element :");
    for (int i = 0; i < ne; i++) {
      numArray[i] = sc.nextDouble();
    }

    // sum of elements of an array
    for (double num : numArray) {
      sum += num;
    }

    //calculate the average of an array
    double average = sum / numArray.length;

    System.out.printf("The average is : %.2f", average);
  }
}
