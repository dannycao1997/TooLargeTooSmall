import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        startGame();
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(5); // 0-5 numbers
        return randomNumber;
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int randomGuess = getRandomNumber();

        while (true) {
            System.out.println("Guess and enter a the random number from 0 - 5 : ");
            int input = scanner.nextInt();

            if (input > randomGuess) {
                System.out.println("Your input is greater than the number to guess");
            } else if (input < randomGuess) {
                System.out.println("Your input is less than the number to guess");
            } else {
                System.out.println("You guesses the correct number");
                break;
                }
            }
        }
    }





