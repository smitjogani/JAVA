abstract class calculaction{
    double height,width;
    calculaction(double height,double width){
        this.height = height;
        this.width = width;
    }
    abstract double area();
}

class rectangle extends calculaction{
    rectangle(double h,double w){
        super(h,w);
    }
    double area(){
        return height * width;
    }
}

class triangle extends calculaction{
    triangle(double h,double w){
        super(h,w);
    }
    double area(){
        return 0.5 * height * width;
    }
}

class march9{
    public static void main(String[] args) {
        calculaction cl;
        rectangle r = new rectangle(10,15);
        cl = r;
        System.out.println("Area of rectangle is "+cl.area());

        triangle t = new triangle(10.5,10.5);
        cl = t;
        System.out.println("Area of triangle is " +cl.area());
    }
}