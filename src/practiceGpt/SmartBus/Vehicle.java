package practiceGpt.SmartBus;

public abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void info() {
        System.out.println("THis is a public vehicle");
    }
}
