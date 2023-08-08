//calculater using switch case:

import java.util.*;

class feb27{
    public static void main(String[] args) {

        Scanner er = new Scanner(System.in);

        int ch,a,b;
        System.out.println("Options:");

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter Your Choice:");
        ch = er.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter value of a:");
                a = er.nextInt();

                System.out.println("Enter value of b:");
                b = er.nextInt();

                int add = a + b;

                System.out.println("Sum of" +a+ "and" +b+ "is");
                System.out.println(add);
            break;
            
            case 2:
                System.out.println("Enter value of a:");
                a = er.nextInt();

                System.out.println("Enter value of b:");
                b = er.nextInt();

                int sub = a - b;

                System.out.println("Subtraction of" +a+ "and" +b+ "is");
                System.out.println(sub);
            break;
        
            case 3:
                System.out.println("Enter value of a:");
                a = er.nextInt();

                System.out.println("Enter value of b:");
                b = er.nextInt();

                int multiplication = a*b;

                System.out.println("multiplication of" +a+ "and" +b+ "is");
                System.out.println(multiplication);
            break;

            case 4:
                System.out.println("Enter value of a:");
                a = er.nextInt();

                System.out.println("Enter value of b:");
                b = er.nextInt();
                
                float division = a/b;
                
                System.out.println("Division of " +a+ "and" +b+ " is ");
                System.out.println(division);
            break;

            default:
                break;
        }
    }
}