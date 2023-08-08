// number is even or odd

import java.util.*;

class feb20{
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int number = dc.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}