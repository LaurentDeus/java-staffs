import java.util.Random;
import java.util.Scanner;


public class GuessGame{

public static void main(String[] args){

var ro = new Random();
var input = new Scanner(System.in);
var trials = 3;

var randomNumber = ro.nextInt(9) + 1;

while(trials > 0){


System.out.println("What number I'm I thinking: ");

var guess = input.nextInt();

System.out.println("I was thinking about "+ randomNumber); 

trials --;

}


}


}