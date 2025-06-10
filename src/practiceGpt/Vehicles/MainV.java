package practiceGpt.Vehicles;

import java.util.ArrayList;
import java.util.Scanner;

public class MainV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<UserVehicles> vehiclesList = new ArrayList<>();

        System.out.println("How many vehicles do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\nVehicles #" + (i + 1));
            UserVehicles vehicles = new UserVehicles();
            System.out.println("Enter vehicle name: ");
            String name = scanner.nextLine();
            vehicles.setName(name);

            System.out.println("Enter fuel type(e.g., gasoline, diesel, electric): ");
            String fuel = scanner.nextLine();
            vehicles.setFuelType(fuel);
            vehiclesList.add(vehicles);
        }

        System.out.println();
        for (UserVehicles v : vehiclesList) {
        v.showInfo();
        v.start();
        v.stop();
    }

        scanner.close();
    }
}
