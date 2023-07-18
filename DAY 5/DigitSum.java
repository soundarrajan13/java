public class DigitSum {

    public static int calculateDigitSum(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int sum = 0;

        while (N != 0) {
            int digit = N % 10; // Extract the last digit of the number
            sum += digit; // Add the last digit to the sum
            N /= 10; // Remove the last digit from the number
        }

        return sum;
    }

    public static void main(String[] args) {
        int N = 1234567890; // Change this number to calculate the digit sum for a different value

        try {
            int digitSum = calculateDigitSum(N);
            System.out.println("The sum of all digits in the number " + N + " is: " + digitSum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
