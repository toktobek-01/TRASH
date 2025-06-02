package practiceGpt.ElectriCar;

public abstract class Vehicle {
    abstract void start();
    abstract void stop();
    abstract void color();
    abstract void power();


    void info() {
        System.out.println("This car is a vehicle..");
    }
}
