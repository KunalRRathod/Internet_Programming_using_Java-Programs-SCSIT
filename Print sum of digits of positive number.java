import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a positive number: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Calculate sum of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum); //Print output
    }
}
