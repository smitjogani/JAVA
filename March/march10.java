// Print Right Triangle Star Pattern

import java.io.*;

public class march10{
    public static void starRightTriangle(int n){
        int a,b;

        // outer loop to handle number of rows
        for(a = 0; a < n ; a++){
            
            // inner loop to handle number of columns
            for(b = 0; b <= a; b++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int k = 5;
        starRightTriangle(k);
    }
}