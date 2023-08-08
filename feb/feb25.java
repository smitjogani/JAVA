// Factor of a posistive number using function:

import java.util.*;

class feb25{
    public static void findFactor(int n){
        for(int i = 1; i<= n ; i++){
            if(n % i == 0){
                System.out.println(i + "\t");
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner io = new Scanner(System.in);
        
        int number = 0;

        System.out.println("Enter the number:");
        number = io.nextInt();

        System.out.println("The Factor Are :");
        findFactor(number);


    }
}