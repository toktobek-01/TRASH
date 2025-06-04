package practiceGpt.ElectriCar;

public abstract class Vehicle {
   public abstract void start();
    public abstract void stop();
    public abstract void color();
    public abstract void power();



    void info() {
        System.out.println("This car is a vehicle..");
    }
}
