import java.util.*;

abstract class vehicle{
    abstract void numWheels();
}

class car extends vehicle{
    void numWheels(){
        System.out.println("From car + vehicle");
    }
}

class truck extends vehicle{
    void numWheels(){
        System.out.println("From truck + vehicle");
    }
}

class ch2p7{
    public static void main(String[] args) {
        vehicle vh;
        car c = new car();
        vh = c;
        vh.numWheels();

        truck t = new truck();
        vh = t;
        vh.numWheels();
    }
}