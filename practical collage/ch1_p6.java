import java.util.*;

class overload{
    void areaOfSquare(float x){
        System.out.println("The area of square is " + Math.pow(x,2) + "sq unit");        
    }
    void areaOfSquare(float x,float y){
        System.out.println("the area oof rectangle is " + x*y + "sq unit");
    }
}
class ch1_p6{
    public static void main(String[] args) {
        overload ov = new overload();

        ov.areaOfSquare(10);
        ov.areaOfSquare(6, 7);
    }
}