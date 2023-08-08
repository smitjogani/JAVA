// //  Sum of n nutural number 

// import java.util.*;

// class feb21{
//     public static void main(String[] args) {

//         Scanner fg = new Scanner(System.in);
        
//         System.out.println("Enter the number :");
//         int j = fg.nextInt();

//         int sum = 0;

//         for(int i = 0; i < j; i++){
//             sum = sum + i;
//         }

//         System.out.println("Sum :" + sum);
//     }
// }

import java.util.*;

public class feb21
{
    public static void main(String args[])
    {
        int i, n, sum=0, num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enetr the numbers :");
        n = scan.nextInt();
        
        for(i=0; i<n; i++)
        {
            sum = sum + num;
        }
        System.out.print("Sum of all " +n+ " numbers are " +sum);
    }
}