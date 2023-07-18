public class FactorialCalculator {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial for a different value

        try {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
