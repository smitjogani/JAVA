//package

package pack;

public class A{
int a,b,c;

public A(int a,int b,int c){
    this.a = a;
    this.b = b;
    this.c = c;
}

public void findmax(){
    if(a>b && a>c){
        System.out.println("A is big ::->" +a);
    }
    else if(b>a && b>c){
        System.out.println("B is big ::->" +b);
    }
    else{
        System.out.println("C is big ::->" +c);
    }
}
}