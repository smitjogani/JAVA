// Java Program to Calculate the Power of a Number

import java.util.*;

class power1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base :");
        int base = sc.nextInt();

        System.out.println("Enter the exponent :");
        int exponent = sc.nextInt();

        double result = Math.pow(base , exponent);
        System.out.println("Answer = " + result);
    }
}