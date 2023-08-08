// Factorial using recurction

import java.util.*;

public class factorial_recurction9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        long fact = factorial(num);

        System.out.println("Factorial of " + num + " is " +fact);
    }

    public static long factorial(int num)
    {
        if (num >= 1)
        {
            return num * factorial(num - 1);
        }
        else 
        {
            return 1;
        }
    }
}