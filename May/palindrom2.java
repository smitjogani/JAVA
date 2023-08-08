// Java Program to Check Palindrome

import java.util.*;

public class palindrom2
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String reverseStr = "";

        // get input from user
        System.out.println("Enter the string :");
        String str = sc.nextLine();

        //find length of string
        int strLength = str.length();

        for ( int i = (strLength - 1 ); i >= 0; --i)
        {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase()))
        {
            System.out.println(str + " is a palindrome String.");
        }
        else
        {
            System.out.println(str +" is not a palindrome String.");
        }
    }
}