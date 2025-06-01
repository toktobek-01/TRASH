package practiceGpt;

public class Main {
    public static void main(String[] args) {
        Drivable[] vehicles = {
                new Car(),
                new Truck(),
                new Bike()
        };

        for (Drivable v : vehicles) {
         v.drive();
         v.stop();
            System.out.println();
        }
    }
}
