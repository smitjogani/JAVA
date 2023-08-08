// G.C.D. using recurction

import java.util.*;

public class gcd_recurction10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of number 1 :");
        int n1 = sc.nextInt();

        System.out.println("Enter the value of number 2 :");
        int n2 = sc.nextInt();

        int gcd = gcd(n1,n2);

        System.out.println("G.C.D. of " + n1 + " and " +n2 +" is " +gcd );
    }

    public static int gcd(int n1,int n2)
    {
        if(n2 != 0)
        {
            return gcd(n2 , n1 % n2);
        }
        else
        {
            return n1;
        }
    }
}