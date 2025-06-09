package practiceGpt.Vehicles;

import java.util.Scanner;

public class MainV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserVehicles vehicles = new UserVehicles();

        System.out.println("Enter vehicle name: ");
        String name = scanner.nextLine();
        vehicles.setName(name);

        System.out.println("Enter fuel type(e.g., gasoline, diesel, electric): ");
        String fuel = scanner.nextLine();
        vehicles.setFuelType(fuel);

        System.out.println();
        vehicles.showInfo();

        scanner.close();
    }
}
