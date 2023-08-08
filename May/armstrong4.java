// check armstrong number

import java.util.*;

public class armstrong4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // take input number from user
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int result = 0;
    int originalNumber, reminder;

    originalNumber = number;

    while (originalNumber != 0) {
      reminder = originalNumber % 10;
      result += Math.pow(reminder, 3);
      originalNumber /= 10;
    }

    if (result == number) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}
