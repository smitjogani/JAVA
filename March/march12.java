// Display string in reverce order

import java.util.*;

class march12{
    public static void main(String[] args) {
        String original,reverse = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        original = sc.nextLine();

        int length = original.length();
        System.out.println("Display Reverce order:");

        for(int i=length - 1; i >= 0; i--){
            System.out.println(original.charAt(i));
        }
    }
}