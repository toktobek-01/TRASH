import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        if (password.length() < 6) {
            System.out.println("Weak: too short");
        } else if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong password");
        } else {
            System.out.println("Moderate password: try using uppercase, lowercase, numbers, and special characters.");
        }

        scanner.close();
    }
}

