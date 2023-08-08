// Java Program to Add Two Complex Numbers by Passing Class to a Function

public class add_fun20
{
    // global variable 
    double real;
    double imag;

    // constructer

    public add_fun20(double real,double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    // main function
    public static void main(String[] args) 
    {
        // object of constructer
        add_fun20 n1 = new add_fun20(2.3,4.5),
                         n2 = new add_fun20(3.4,5.0),
                         temp;
        
        // calling add function
        temp = add(n1,n2);

        System.out.printf("Sum = %.1f + %.1fi" , temp.real , temp.imag);
    }

    // add function
    public static add_fun20 add(add_fun20 n1,add_fun20 n2)
    {
        add_fun20 temp = new add_fun20(0.0 , 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return (temp);
    }
}