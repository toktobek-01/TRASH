abstract class Cars {
    abstract void start();

    void stop() {
        System.out.println("Car stopped");
    }
}

class Car extends  Cars{
    @Override
    void start() {
        System.out.println("Car started");
    }
}