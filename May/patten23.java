/*

    1
    1 2
    1 2 3 
    .
    .
    .
    n
 */

import java.util.*;

public class patten23 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
