import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class CAI {

    ArrayList<Integer> question;
    SecureRandom sc;
    int firstNumber;
    int secondNumber;
    int level;
    static final char[] ops = new char[] { '+', '-', 'x', '/' };/// enums??

    public CAI(int level) {
        this.level = level;
    }

    public void initializeQuestion() {
        sc = new SecureRandom();

        if (level == 1) {
            firstNumber = sc.nextInt(10);
            secondNumber = sc.nextInt(10);
        } else if (level == 2) {
            firstNumber = sc.nextInt(41) + 10;
            secondNumber = sc.nextInt(41) + 10;
        } else {
            firstNumber = sc.nextInt(51) + 50;
            secondNumber = sc.nextInt(41) + 50;
        }

        question = new ArrayList<Integer>();
        question.add(firstNumber);
        question.add(secondNumber);
    }

    public ArrayList<Integer> askQuestion() {
        initializeQuestion();
        execute(5, question);
        return question;
    }

    public ArrayList<Integer> askQuestion(int problemType) {
        initializeQuestion();
        execute(problemType, question);
        return question;
    }

    public void execute(int problemType, ArrayList<Integer> question) {
        sc = new SecureRandom();
        switch (problemType) {
            case 1:
                question.add(firstNumber + secondNumber);
                question.add(0);
                break;
            case 2:
                question.add(firstNumber - secondNumber);
                question.add(1);
                break;
            case 3:
                question.add(firstNumber * secondNumber);
                question.add(2);
                break;
            case 4:
                question.add(firstNumber / secondNumber);
                question.add(3);
                break;
            default:
                var op_idx = sc.nextInt(4);
                execute(op_idx, question);
        }
    }

    public void repeatQuestion(int firstNumber, int secondNumber, int op) {
        System.out.println("Thats Not correct, Please try again!");
        System.out.println(String.format("What is %d %c %d", firstNumber, ops[op], secondNumber));
    }

    public static void main(String[] args) {
        final char[] ops = new char[] { '+', '-', 'x', '/' };/// enums??
        var obj = new CAI(1);
        while (true) {

            var question = obj.askQuestion();
            var firstNumber = question.get(0);
            var secondNumber = question.get(1);
            var op = question.get(3);
            var answer = question.get(2);

            var input = new Scanner(System.in);
            System.out.println(String.format("What is %d %c %d", firstNumber, ops[op], secondNumber));
            var UserAnswer = input.nextInt();

            if (UserAnswer != answer) {
                do {
                    obj.repeatQuestion(firstNumber, secondNumber, op);
                    System.out.print("Your answer: ");
                    UserAnswer = input.nextInt();
                } while (UserAnswer != answer);

            }
            System.out.println(
                    String.format("Thats correct %d %c %d is indeed %d", firstNumber, ops[op], secondNumber, answer));
            ;
        }
    }
}
