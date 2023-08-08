// Java Program to Count the Number of Vowels and Consonants in a Sentence

import java.util.*;

public class count_vowels18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the String : ");
    String str = sc.nextLine();

    int vowels = 0, consonant = 0, digits = 0, spaces = 0;
    str = str.toLowerCase();

    for(int i=0;i<str.length() ; i++)
    {
        // put characyter one by one
        char ch = str.charAt(i);

        // check if character have any vowels : a e i o u

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            ++vowels;
        }

        // check if character is in between a to z:

        else if ((ch >= 'a' && ch <= 'z'))
        {
            ++consonant;
        }

        //check if character is in between 0 to 9

        else if((ch >= '0' && ch <= '9'))
        {
            ++digits;
        }

        //check if character is a white space

        else if (ch == ' ')
        {
            ++spaces;
        }
    }

    System.out.println("Vowels : " +vowels);
    System.out.println("Consonants : " + consonant);
    System.out.println("Digits : " + digits);
    System.out.println("White Spaces :" + spaces);
  }
}
