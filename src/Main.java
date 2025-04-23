import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Guess the number");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numberSecret = rd.nextInt(50)+1;
        int guess = 0;
        int attempts = 0;

        while (attempts < 5){
            System.out.println("Enter the number: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > numberSecret){
                System.out.println("The draw number is lower. Try again");
            } else if (guess < numberSecret) {
                System.out.println("The draw number is higer. Try again");
            } else {
                System.out.println("Congratulations! You got it right in " + attempts + " attempts.");
                break;
            }

            if (attempts == 5){
                System.out.println("You have used up your three attempts. GAME OVER");
                break;
            }


        }
        sc.close();
    }
}