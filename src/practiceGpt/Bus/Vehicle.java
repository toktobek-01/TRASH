package practiceGpt.Bus;

public abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void basicInfo() {
        System.out.println("This is a basic vehicle.");
    }
}
