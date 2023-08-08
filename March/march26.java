//use Super Keyword with method

class person{
    void message(){
        System.out.println("This is person of class");
    }
}

class student extends person{
    void message(){
        System.out.println("This is student class");
    }

    void display(){
        message();

        super.message();
    }
}

class march26{
    public static void main(String[] args) {
        student s = new student();

        s.display();
    }
}