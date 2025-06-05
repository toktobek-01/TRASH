package practiceGpt.Vehicles;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a vehicle:");
        System.out.println("1. Car.");
        System.out.println("2. Truck.");
        System.out.println("3. Train.");
        System.out.println("4. Jet,");
        System.out.println("Enter your choice: (1-4):");

        int choice = scanner.nextInt();
        VehicleActions vehicle;

        switch (choice){
            case 1:
                vehicle = new Car();
                break;
            case 2:
               vehicle = new Truck();
                break;
            case 3:
                vehicle = new Train();
                break;
            case 4:
                vehicle = new Jet();
            default:
                System.out.println("Invalid choice.");
                            return;
        }
        vehicle.start();
        vehicle.fuelType();
        vehicle.stop();

        scanner.close();
    }
}
