import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class CAI {
    public static ArrayList<Integer> askQuestion() {
        var sc = new SecureRandom();
        var question = new ArrayList<Integer>();
        var firstNumber = sc.nextInt(11);
        var secondNumber = sc.nextInt(11);
        question.add(firstNumber);
        question.add(secondNumber);
        question.add(firstNumber * secondNumber);
        System.out.println(String.format("What is %d x %d", firstNumber, secondNumber));
        return question;
    }

    public static void repeatQuestion(int firstNumber, int secondNumber) {
        System.out.println("Thats Not correct, Please try again!");
        System.out.println(String.format("What is %d x %d", firstNumber, secondNumber));
    }

    public static void main(String[] args) {
        while (true) {

            var question = askQuestion();
            var firstNumber = question.get(0);
            var secondNumber = question.get(1);
            var answer = question.get(2);

            var input = new Scanner(System.in);
            System.out.print("Your answer: ");
            var UserAnswer = input.nextInt();

            if (UserAnswer != answer) {
                do {
                    repeatQuestion(firstNumber, secondNumber);
                    System.out.print("Your answer: ");
                    UserAnswer = input.nextInt();
                } while (UserAnswer != answer);

            }
            System.out.println(
                    String.format("Thats correct %d x %d is indeed %d", firstNumber, secondNumber, answer));
            ;
        }
    }
}
