package practiceGpt;

public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("THis car drives...");
    }
    @Override
    public void stop() {
        System.out.println("THis car stopped....");
    }
}
