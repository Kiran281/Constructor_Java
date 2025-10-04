// single ineritance 
class Vehicle{
Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class InheritanceEx2 {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
    }
}