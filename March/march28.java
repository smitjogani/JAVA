// method overriding

class parent{
    void show(){
        System.out.println("Parent's show()");
    }
}

class child extends parent{
    @Override void show(){
        System.out.println("Child'd show()");
    }
}

class march28{
    public static void main(String[] args) {
        parent p1 = new parent();
        parent p2 = new child();

        p1.show();
        p2.show();
    }
}