import java.util.Random;
import java.util.Scanner;
public class Num_guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        int count = 0;
        while (true) {
            count++;
            System.out.println("enter your guess(1-100):");
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You Won!!");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Number you entered is too low");
            } else {
                System.out.println("Number you entered is too high");
            }
        }
        System.out.println("you have taken " + count + " chances and your score is...");
        if (count == 1) {
            System.out.println("--> 100!");
        } else if (count == 2) {
            System.out.println("--> 80!");
        } else if (count == 3) {
            System.out.println("--> 50");
        } else if (count == 4) {
            System.out.println("--> 40");
        } else if (count == 5) {
            System.out.println("--> 30");
        } else {
            System.out.println("--> 15");
        }
    }
}