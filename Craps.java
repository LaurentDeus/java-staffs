import java.security.SecureRandom;

public class Craps {

    private enum Status { CONTINUE, WON, LOST };

    public int rollDice() {
        var face = new SecureRandom();
        var total = face.nextInt(6) + 1 + face.nextInt(6) + 1;
        System.out.println(String.format("Total Upward Faces on first Attempt is %d", total));
        return total;
    }

    public int checkWinStatus(int sumOfUpwardFaces) {
        Status gStatus;
        if (sumOfUpwardFaces == 7 || sumOfUpwardFaces == 11) {
            System.out.println("You Won on first Attempt");
            gStatus = Status.WON;
            return 1;
        }
        if (sumOfUpwardFaces >= 4 && sumOfUpwardFaces <= 10) {
            System.out.println("Rolling Again cause you rolled Crap");
            gStatus = Status.CONTINUE;
            var point = rollDice();
            while (point != 7) {
                if (point == sumOfUpwardFaces) {
                    System.out.println("You Won Cause You roll your point After crap");
                    gStatus = Status.WON;
                    return 1;
                }
                point = rollDice();
                System.out.println("You rolled " + point);
            }
            System.out.println("You Lost cause you rolled 7 after crap");
        }
        System.out.println("You Lost");
        return 0;
    }

    public static void main(String[] args) {
        var crap = new Craps();
        crap.checkWinStatus(crap.rollDice());
    }

}

// algorithm,
// roll dice twice to get total
// if else statment base on the logic
