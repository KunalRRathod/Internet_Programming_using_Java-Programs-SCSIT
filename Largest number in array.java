public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 324, 45, 90, 9808}; // Example array
        int max = findLargest(numbers);
        System.out.println("The largest element in the array is: " + max);
    }

    // Function to find the largest element in an array
    public static int findLargest(int[] array) {
        int max = array[0]; // Initialize max with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
