interface number{
    int process(int x,int y);
}
class sum{
    int z;
    public int process(int x,int y){
        z = x + y;
        System.out.println("The value of z is: " +z);
        return z;
    }
}

class average  implements number{
    int tot,avg;
    public int process(int a,int b){
        tot = a + b;
        avg = tot / 2;
        System.out.println("The average is : " +avg);
        return avg;
    }
}
public class ch2_p5 {
    public static void main(String[] args) {
        sum s = new sum();
        average a = new average();
        s.process(10, 20);
        a.process(50, 50);
    }
}
