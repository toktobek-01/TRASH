public class ElectricCar extends Cars{
    @Override
    void start() {
        System.out.println("Electric car started.");
    }

    @Override
    void fuelType() {
        System.out.println("This car runs with electricity.");
    }

    @Override
    void stop() {
        System.out.println("This car is stopped.");
    }
}
