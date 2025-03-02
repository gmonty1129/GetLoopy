import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Roll: Die1: Die2: Die3: Sum:");
            System.out.println("--------------------------------");

            int rollCount = 0;
            int die1, die2, die3;

            do {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d %n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple achieved!\n");

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.next().toUpperCase();
            playAgain = response.equals("y");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
