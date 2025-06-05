package practiceGpt.Vehicles;
public class Jet implements VehicleActions {
    @Override
    public void start() {
        System.out.println("Jet started.");
    }
    @Override
    public void stop() {
        System.out.println("Jet stops at airport.");
    }
    @Override
    public void fuelType() {
        System.out.println("Jet uses diesel.");
    }
}
