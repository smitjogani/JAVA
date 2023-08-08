import java.util.*;

public class ch1_p4 {
    public static void main(String [] args){
        Scanner cv = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = cv.nextInt();

        System.out.println("Enter value of b:");
        int b = cv.nextInt();

        System.out.println("Enter value of c:");
        int c = cv.nextInt();

        if(a > b && a>c){
            System.out.println("A is largest number");
        }
        else if(b > c && b > a){
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }
    }
}
