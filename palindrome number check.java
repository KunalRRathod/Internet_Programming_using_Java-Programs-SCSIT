public class PalindromeExample {
    public static void main(String[] args) {
        int num = 16461; // Number to check
        int reversedNum = 0, remainder, originalNum;

        originalNum = num;

        // Reversed integer is stored in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Check if original number is equal to reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
