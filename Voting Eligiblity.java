import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting name and age from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Using ternary operator to check voting eligibility
        String message = (age >= 18) ? name + " is eligible for vote" : name + " is not eligible for vote";

        // Printing the result
        System.out.println(message);
    }
}
