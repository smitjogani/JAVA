// Abstraction class 

abstract class Shape{
    String color;

    abstract double area();
    public  abstract String toStrinng();

    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getcolor(){
        return color;
    }

}

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);

        System.out.println("circle constructor called");
        this.radius = radius;
    }

    @Override double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override public String toStrinng(){
        return "Circle color is " + super.getcolor() + " and area is " + area();
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);

        System.out.println("Rectangle constructor is called");
        this.length = length;
        this.width = width;
    }

    @Override double area(){
        return length * width;
    }

    @Override public String toStrinng(){
        return "Rectangle color is " + super.getcolor() + " and area is " + area();
    }
}

class march24{
    public static void main(String[] args) {
        Shape s1 = new Circle("Red" , 2);
        Shape s2 = new Rectangle("Green" , 4 , 4);

        System.out.println(s1.toStrinng());
        System.out.println(s2.toStrinng());
    }
}