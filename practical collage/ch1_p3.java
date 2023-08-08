import java.util.*;

public class ch1_p3 {
     public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Case 1 -> seat cover");
        System.out.println("Case 2 -> steering wheel covers");
        System.out.println("Case 3 -> car lighting");
        System.out.println("Case 4 -> air purifier");
        System.out.println("Case 5 -> all other items");

        double price;
        double tax;
        double total;
        String item;

        System.out.println("Enter choice :");
        int ch = x.nextInt();

        System.out.println("Enter price:");
        price = x.nextDouble();

        switch(ch){
            case 1:
                double text_rate = 0.02;
                tax = price * text_rate;
                total = price + tax;
                System.out.println("Price is " + price);
                System.out.println("tax of seat cover is " +tax);
                System.out.println("total of seat cover is "+total);
                break;
            
            case 2:
                double text_rate2 = 0.03;
                tax = price * text_rate2;
                total = price + tax;
                System.out.println("Price is "+price);
                System.out.println("tax of steering wheel is "+tax);
                System.out.println("total of steering wheel is "+total);
                break;
                
            case 3:
                double text_rate3 = 0.04;
                tax = price * text_rate3;
                total = price + tax;
                System.out.println("price is "+price);
                System.out.println("taax of carr lighting is "+tax);
                System.out.println("total of car lighting is "+total);
                break;
            case 4:
                double text_rate4 = 0.25;
                tax = price * text_rate4;
                total = price + tax;
                System.out.println("price is "+price);
                System.out.println("tax of air purifier is "+tax);
                System.out.println("total of air purifier is "+total);
                break;
            case 5:
                double text_rate5 = 0.12;
                tax = price * text_rate5;
                total = price + tax;
                System.out.println("price is "+price);
                System.out.println("tax of other item is "+tax);
                System.out.println("total of other item is "+total);
                break;
            default:
            
        }
    }    
}
