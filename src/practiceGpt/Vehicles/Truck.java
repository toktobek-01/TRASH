package practiceGpt.Vehicles;

public class Truck implements VehicleActions {
    @Override
    public void start() {
        System.out.println("Truck started.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Truck runs on diesel.");
    }
}

