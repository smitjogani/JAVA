import java.util.*;

class feb22{

    public static void main(String[] args) {

        Scanner zx = new Scanner(System.in);

        int num1,num2,num3;

        System.out.print("Enter num1 :");
        num1 = zx.nextInt();

        System.out.print("Enter num2 :");
        num2 = zx.nextInt();

        System.out.print("Enter num3 :");
        num3 = zx.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("The maximum number is "+num1);        
            }
            else{
                System.out.println("The maximum number is "+num3);
            }  
        }     
        
        else{
            if(num2 > num3){
                System.out.println("The maximum number is "+num2);
            }
            else{
                System.out.println("The maximum number is "+num3);
            }
        }
        
    }
}