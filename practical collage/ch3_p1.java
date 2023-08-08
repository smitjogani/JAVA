package p;

public class PackClass{
        int a,b,c;

        public PackClass(int a,int b,int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void findmax(){
            if(a>b && a>c){
                System.out.println("A is big "+a);
            }
            else if(b>a && b>c){
                System.out.println("B is big "+b);
            }
            else{
                System.out.println("C is big "+c);
            }
        }

}


class ch3_p1{
    public static void main(String[] args) {
        PackClass p = new PackClass(10,20,30);
        p.findmax();
    }
}   