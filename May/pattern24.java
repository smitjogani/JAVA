/*
 
A
A B
A B C
 ..

 */

 import java.util.*;

 public class pattern24
 {
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the last character (in capital laters): ");
        char last = sc.next().charAt(0);

        char alphabet = 'A';

        for(int i=1; i <= (last - 'A' + 1); ++i)
        {
            for(int j=1; j <= i ; ++j)
            {
                System.out.print(alphabet + " ");
            }
            ++alphabet;
            System.out.println();
        }
     }
 }