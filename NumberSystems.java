import java.util.ArrayList;
import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter Your Decimal Number");
        var decimal = input.nextInt();
        System.out.println(decimalToHex(decimal));
        input.close();
    }

    public static ArrayList<Integer> decimalToHex(int decimal) {
        var reminders = new ArrayList<Integer>();
        if (decimal > 0) {
            while (decimal > 0) {
                var reminder = decimal % 16;
                reminders.add(reminder);
                decimal = decimal / 16;
            }
            return reminders;
        } else {
            reminders.add(0);
            return reminders;
        }
    }
}
