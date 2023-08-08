import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        int n1 = sd.nextInt();

        System.out.println("Enter number 2:");
        int n2 = sd.nextInt();

        System.out.println("Enter number 3:");
        int n3 = sd.nextInt();

        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2  <n3 ? n2 : n3);
        System.out.println("Maximum number is "+max);

        int min = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2  <n3 ? n2 : n3);
        System.out.println("Minimum number is "+min);
    }
}