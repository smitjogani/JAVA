import java.util.*;

public class ch1_p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double hypotenuse,x,y;

        System.out.println("Enter x:");
        x = s.nextInt();

        System.out.println("Enter y:");
        y = s.nextInt();

        double ans = (x * x) + (y * y);

        hypotenuse = Math.sqrt(ans);

        System.out.println("The Square root of hypotenuse is " +hypotenuse);
    }
}
