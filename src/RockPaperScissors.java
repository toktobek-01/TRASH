import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.print("Enter your move (rock, paper, scissors): ");
        String playerMove = scanner.nextLine().toLowerCase();

        int index = random.nextInt(3);
        String computerMove = options[index];

        System.out.println("Computer chose: " + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (
                (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                        (playerMove.equals("paper") && computerMove.equals("rock")) ||
                        (playerMove.equals("scissors") && computerMove.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}

