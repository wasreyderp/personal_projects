
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNum = (int)(Math.random() * 100) + 1;
        int userNumber = 0;
        
        do { 
            System.out.println("Guess a number between 1 and 100");
            System.out.println("Enter -1 to quit");
            userNumber = sc.nextInt();
            if (userNumber == myNum) {
                System.out.println("correct");
                break;
            }
            else if (userNumber > myNum) {
                System.out.println("your number is larger");
            }
            else if (userNumber < myNum) {
                System.out.println("your number is smaller");
            }
        } while (userNumber >= 0);
        sc.close();

    }
}
