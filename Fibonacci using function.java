public class FibonacciSeries {
    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + " " + num2);

        for (int i = 2; i < n; i++) { //Fibonacci Sequence
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Print upto 10 terms
        printFibonacci(n);
    }
}
