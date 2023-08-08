// Java Program to Find the Frequency of Character in a String

import java.util.*;

public class frequency_of_char17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string :");
    String str = sc.nextLine();

    System.out.println("Enter the character :");
    char ch = sc.next().charAt(0);

    int frequency = 0;

    for (int i = 0; i < str.length(); i++) {
      if (ch == str.charAt(i)) {
        ++frequency;
      }
    }

    System.out.println("Frequency of " + ch + " = " + frequency);
  }
}
