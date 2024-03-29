import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random ro = new Random();
        Scanner input = new Scanner(System.in);
        int trials = 3;
        boolean guessed = false;
        int randomNumber = ro.nextInt(9) + 1;

        while (trials > 0) {
            trials--;
            System.out.printf("%nWhat number am I thinking of?%nHint: it is between 1 and 10%n");
            int guess = input.nextInt();

            if (guess == randomNumber) {
                System.out.printf("%nCongratulations, you guessed it with just %d trials%n ", 3 - trials);
                guessed = true;
                break;
            } else if (guess > randomNumber && trials != 0) {
                System.out.printf("%nThat's higher. Try a lower number. You have %d trials left%n", trials);
            } else {
                if (trials != 0) {
                    System.out.printf("%nThat's lower. Try a higher number. You have %d trials left%n", trials);
                }
            }
        }

        if (!guessed) {
            System.out.printf("%nSorry, mate. Better luck next time. I was thinking of %d%n", randomNumber);
        }
    }
}
