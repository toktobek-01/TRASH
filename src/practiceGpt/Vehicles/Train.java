package practiceGpt.Vehicles;

public class Train implements VehicleActions {
    @Override
    public void start() {
        System.out.println("Train started.");
    }

    @Override
    public void stop() {
        System.out.println("Train stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Train runs on electricity.");
    }
}

