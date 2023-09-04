/*
Objective: To identify and fix errors in a Java program that demonstrates basic object-oriented programming
principles.

Explanation of error: There was an error in the code. The car object is trying to call a stop method, which
is not defined in the Car class. To fix this error, we should define a stop method in the Car class.
 */
class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car.");
    }
    //Here I am defining a stop method in the Car class to fix the error.
    public void stop() {
        System.out.println("Stopping the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
    }
}