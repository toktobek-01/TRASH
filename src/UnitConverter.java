import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to convert?");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            double miles = value * 0.621371;
            System.out.printf("%.2f kilometers is %.2f miles\n", value, miles);
        } else if (choice == 2) {
            double km = value / 0.621371;
            System.out.printf("%.2f miles is %.2f kilometers\n", value, km);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
