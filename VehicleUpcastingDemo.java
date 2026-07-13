class Vehicle {
    void start() {
        System.out.println("Vehicle engine starts.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

public class VehicleUpcastingDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Bike();   // Upcasting

        vehicle.start();

        // vehicle.ride(); // Not accessible
    }
}