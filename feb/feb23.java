// Swapping of two number:
import java.util.*;

class feb23{
    public static void main(String[] args) {
        int n1,n2,temp;        

        Scanner gh = new Scanner(System.in);

        System.out.println("Before Swapping:");
        System.out.println("Enter number 1:");
        n1 = gh.nextInt();
        System.out.println("Enter number 2:");
        n2 = gh.nextInt();

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping:");

        System.out.println(n1);
        System.out.println(n2);
    }
}