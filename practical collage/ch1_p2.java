import java.util.*;

public class ch1_p2{
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter p:");
        double principal = x.nextDouble();

        System.out.println("Enter r:");
        double rate = x.nextDouble();
        rate = rate/(12 * 100);

        double time = 5;
        time = time * 12;

        double emi = (principal * rate * Math.pow(1 + rate,time))/(Math.pow(1 + rate,time)-1);
        System.out.println("\nMonthly EMI is " +emi);
    }
}