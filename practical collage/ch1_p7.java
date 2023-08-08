/**
 * ch1_p7
 */
public class ch1_p7 {
    int real,imag,n1,n2;

    ch1_p7(){}
    ch1_p7(int real,int imag){
        this.real = real;
        this.imag = imag;
    }

    ch1_p7 addition(ch1_p7 n1,ch1_p7 n2){
        ch1_p7 sum = new ch1_p7();

        sum.real = n1.real + n2.real;
        sum.imag = n1.imag + n2.imag;

        return sum;
    }
    ch1_p7 subtraction(ch1_p7 n1,ch1_p7 n2){
        ch1_p7 sub = new ch1_p7();

        sub.real = n1.real - n2.real;
        sub.imag = n1.imag - n2.imag;

        return sub;
    }

    ch1_p7 multiplication(ch1_p7 n1,ch1_p7 n2){
        ch1_p7 mul = new ch1_p7();

        mul.real = n1.real * n2.real;
        mul.imag = n1.imag * n2.imag;

        return mul;
    }
    public static void main(String[] args) {
        ch1_p7 c1 = new ch1_p7(3,30);
        ch1_p7 c2 = new ch1_p7(2,20);

        ch1_p7 add = new ch1_p7();
        ch1_p7 sub = new ch1_p7();
        ch1_p7 mul = new ch1_p7();

        add = add.addition(c1,c2);
        sub = sub.subtraction(c1,c2);
        mul = mul.multiplication(c1,c2);

        System.out.println("Sum -> "+add.real+"+"+add.imag+"i");
        System.out.println("Sub -> "+sub.real+"-"+sub.imag+"i");
        System.out.println("Mul -> "+mul.real+"*"+mul.imag+"i");
    }
}