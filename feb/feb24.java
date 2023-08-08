// Fibonaki serires 

import java.util.*;

class feb24{
    public static void main(String[] args) {
        
        Scanner kl = new Scanner(System.in);
        
        int n,firstNum = 0,SecondNum = 1;
        
        System.out.println("Enter n :");
        n = kl.nextInt();

        System.out.println("Fibonacci series till " + n + " terms");

        for(int i = 0; i<=n; ++i){
            int nextNum = firstNum + SecondNum;
            firstNum = SecondNum;
            SecondNum  = nextNum;

            System.out.print(" "+nextNum);
        }
    }
}