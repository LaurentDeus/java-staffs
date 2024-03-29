import java.util.Random;
import java.util.Scanner;


public class GuessGame{

public static void main(String[] args){

var ro = new Random();
var input = new Scanner(System.in);
var trials = 3;
var guessed = false;

var randomNumber = ro.nextInt(9) + 1;

while(trials > 0){

trials --;

System.out.printf("%nWhat number I'm I thinking %nHint: it is between 1 and 10%n");

var guess = input.nextInt();

if(guess == randomNumber){
System.out.printf("%nCongrats, you guessed it with just %d trials%n ",3 - trials);
guessed = true;
break;
}
else if(guess > randomNumber){
System.out.printf("%nThat's Higher, try lower number, and you have %d Trials left",trials);
}

else {
System.out.printf("%nThat's Lower, try higher number, and you have %d Trials left",trials);

}


System.out.printf("%nI was thinking about "+ randomNumber); 

}

if(!guessed){

System.out.printf("%nSorry Mate, Try netx time, I was thinking of ",randomNumber);
}


}


}