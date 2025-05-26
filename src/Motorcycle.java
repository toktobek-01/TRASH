class Motorcycle extends Cars {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    void fuelType() {
        System.out.println("Petrol");
    }
    @Override
    void stop() {
        System.out.println("My bike stopped");
    }

}
