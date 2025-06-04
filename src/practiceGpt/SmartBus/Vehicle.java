package practiceGpt.SmartBus;

public abstract class Vehicle {
    public abstract void start();
    public abstract void stop();


    void info() {
        System.out.println("THis is a public vehicle");
    }
}
