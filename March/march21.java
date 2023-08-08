// Java program to demonstrate working of interface

import java.io.*;

interface in1{
    final int a = 10;

    void display();
}

class march21 implements in1{
    
    public void display(){
        System.out.println("Smit");
    }

    public static void main(String[] args) {
        march21 m = new march21();
        m.display();

        System.out.println(a);
    }
}