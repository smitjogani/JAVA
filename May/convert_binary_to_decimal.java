// Java Program to Convert Binary Number to Decimal and vice-versa

import java.util.*;

public class convert_binary_to_decimal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number :");
        long num = sc.nextLong();

        // Call method by passing the binary number
        int decimal = convert_binary_to_decimal(num);

        System.out.println("Binary to Decimal :");
        System.out.print(num + " = " + decimal);
    }

    public static int convert_binary_to_decimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long reminder;

        while (num != 0)
        {
            reminder = num % 10;
            num /= 10;
            decimalNumber += reminder * Math.pow(2,i);
            ++i;
        }

        return decimalNumber;
    }
}