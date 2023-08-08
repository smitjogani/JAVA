// Data hiding

import java.io.*;

abstract class Creature{

    abstract void N0_Of_Legs();

}

class Elephant extends Creature{
    void N0_Of_Legs(){
        System.out.println("It has four legs");
    }
}

class Human extends Creature{
    void N0_Of_Legs(){
        System.out.println("It has two legs");
    }
}

class march25{
    public static void main(String[] args) {
        Human ob = new Human();
        Elephant ob2 = new Elephant();

        ob.N0_Of_Legs();
        ob2.N0_Of_Legs();

    }
}