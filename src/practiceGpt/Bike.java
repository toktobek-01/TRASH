package practiceGpt;

public class Bike implements Drivable{
    @Override
    public void drive() {
        System.out.println("This bike drives...");
    }

    @Override
    public void stop() {
        System.out.println("This bike is stopped...");
    }
}
