
import java.util.Scanner;




public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pen 10 and notebook 40


        System.out.println("enter the amount of money you have: ");
        int money = sc.nextInt();
        if(money < 10) {
            System.out.println("poor bitch\nget rich");
        }

        else if(money >= 10 && money <= 40) {
            System.out.println("you can only one item");
        }

        else {
            System.out.println("rich mf get anything");
        }



    }
    
}
