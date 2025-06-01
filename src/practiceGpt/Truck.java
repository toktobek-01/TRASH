package practiceGpt;

public class Truck implements Drivable{
    @Override
   public void drive() {
       System.out.println("THis truck is drivable...");
   }
    @Override
    public void stop() {
        System.out.println("This truck is stopped...");

    }
}
