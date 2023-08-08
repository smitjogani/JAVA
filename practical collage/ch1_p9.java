class bank{
    bank(){
        double diposite = 5000,r = 6.5;
        int y=5;
        double ans = diposite * Math.pow((1 + r / 12),(y * 12));
        System.out.println("Ans is :"+ans);
    }
}
public class ch1_p9 {
    public static void main(String[] args) {
        bank b = new bank();
    }
}
