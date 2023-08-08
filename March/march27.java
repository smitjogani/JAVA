// Polymorphism 
//method overloading

class helper{

    static int multiply(int a,int b){
        return a * b;
    }

    static double multiply(double a,double b){
        return a * b;
    }
}

class march27{
    public static void main(String[] args) {
        System.out.println(helper.multiply(2,3));
        System.out.println(helper.multiply(5.5,6.3));
    }
}