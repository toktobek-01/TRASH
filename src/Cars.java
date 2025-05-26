abstract class Cars {
    abstract void start();
    abstract  void fuelType();

    void stop() {
        System.out.println("Car stopped");
    }
}

class Car extends Cars{
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void fuelType() {
        System.out.println("Diesel");
    }
}