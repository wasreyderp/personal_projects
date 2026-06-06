
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        System.out.println("You selected: " + choice);

        System.out.println("enter 1st");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("result = "  + (a + b));
                break;
            case 2:
                System.out.println("result = "  + (a - b));
                break;
            case 3:
                System.out.println("result = "  + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("cannot divide by zero");
                } else {
                    System.out.println("result = " + (a / b));
                }
                break;
            case 5:
                System.out.println("result = " + (a % b));
            default:
                System.out.println("invalid input");
                break;
        }
        sc.close();




        
    }
}
