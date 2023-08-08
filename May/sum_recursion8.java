// Java Program to Find the Sum of Natural Numbers using Recursion

import java.util.*;

public class sum_recursion8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take number from user
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        // call a function named addNumber
        int sum = addNumber(number);

        System.out.println("SUM : " + sum);
    }

    public static int addNumber (int num)
    {
        if (num != 0)
        {
            return num + addNumber(num - 1);
        }
        else
        {
            return num;
        }
    }
}