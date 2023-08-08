import java.util.*;

public class ch1_p8 {
    double dis;
    ch1_p8(double rs){
        if(rs == 1000){
            dis = rs - (rs*10)/100;
            System.out.println("rs -> "+dis);
        }
    }
    public static void main(String[] args) {

    }
}
