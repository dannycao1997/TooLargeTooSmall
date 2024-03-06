import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(6); // 0-5 numbers
        return randomNumber;
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int randomGuess = getRandomNumber();

        System.out.println("Guess and enter a number from 0 -5 : ");
        int input = scanner.nextInt();



    }
}



