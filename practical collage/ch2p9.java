abstract class caculaction{
    double height,width;

    caculaction(double height,double width){
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

class ch2p9{
    public static void main(String[] args) {
        caculaction cl;
        rectangle r = new rectangle();
        cl = r;
        System.out.println("Area of Rectangle is "+ cl.area());
        triangle t = new triangle();
        cl = t;
        System.out.println("Area of Triangle is "+ cl.area());
       }
}