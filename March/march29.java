// Using ‘this’ keyword to refer current class instance variables

class march29{
    int a;
    int b;

    march29(int a,int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        march29 object = new march29(10,20);

        object.display();
    }
}