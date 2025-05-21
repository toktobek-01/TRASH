import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = scanner.nextDouble();

        System.out.print("Enter tip percentage: ");
        double tipPercent = scanner.nextDouble();

        double tip = bill * tipPercent / 100;
        double total = bill + tip;

        System.out.printf("Tip: $%.2f\n", tip);
        System.out.printf("Total amount: $%.2f\n", total);

        scanner.close();
    }
}
