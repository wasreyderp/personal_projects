import java.util.Scanner;

public class gobta {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your age: ");

            int age = sc.nextInt();

            System.out.println("Your age is: " + age);

        }

    }

}