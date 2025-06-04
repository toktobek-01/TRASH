package practiceGpt.Vehicles;

public class Car implements VehicleActions{
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void fuelType() {
        System.out.println("Car runs on gasoline.");
    }
}
