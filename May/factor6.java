// Java Program to Display Factors of a Number

import java.util.*;

public class factor6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Positive number
    System.out.println("Enter the positive number :");
    int number = sc.nextInt();

    System.out.println("Factors of " + number + " are :");

    // loop runs from 1 to 60

    for (int i = 1; i <= Math.abs(number); ++i) {
      // if number is devide by i ,so i is factor

      if (number % i == 0) {
        System.out.println(i + " ");
      }
    }
  }
}
