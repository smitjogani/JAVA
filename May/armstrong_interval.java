// Java program to display armstrong numbers between intervals using function

import java.util.*;

class armstrong_interval {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // take low and high number from user
    System.out.println("Enter the low number : ");
    int low = sc.nextInt();

    System.out.println("Enter the high number : ");
    int high = sc.nextInt();

    for (int number = low + 1; number < high; ++number) {
      if (chk_armstrong(number)) {
        System.out.println(number + " ");
      }
    }
  }

  public static boolean chk_armstrong(int num) {
    int digit = 0;
    int result = 0;
    int originalNumber = num;

    // number of digits calculaction
    while (originalNumber != 0) {
      originalNumber /= 10;
      ++digit;
    }

    originalNumber = num;

    // result contains sum of nth power of its digits
    while (originalNumber != 0) {
      int reminder = originalNumber % 10;
      result += Math.pow(reminder, digit);
      originalNumber /= 10;
    }

    if (result == num) {
      return true;
    }

    return false;
  }
}
