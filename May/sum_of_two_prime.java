// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

import java.util.*;

public class sum_of_two_prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean flag = false;

    System.out.println("Enter the value of number :");
    int number = sc.nextInt();

    for (int i = 2; i <= number; ++i) {
      //condition for i to be prime number
      if (chk_prime(i)) {
        // condition for n-i to be prime number
        if (chk_prime(number - i)) {
          System.out.printf("%d = %d + %d \n", number, i, number - i);
          flag = true;
        }
      }
    }

    if (!flag) {
      System.out.println(
        number + " can not be expresses as the sum of two prime numbers"
      );
    }
  }

  public static boolean chk_prime(int num) {
    boolean isPrime = true;
    for (int i = 2; i <= num; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
