public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input. Nth Fibonacci is defined for positive integers.");
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 8; // Change this number to get the Nth Fibonacci for a different value

        try {
            int result = fibonacciRecursive(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
