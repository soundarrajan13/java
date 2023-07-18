public class DigitSumOdd {

    public static int calculateDigitSumOdd(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int sumOddDigits = 0;

        while (N != 0) {
            int digit = N % 10; // Extract the last digit of the number

            if (digit % 2 != 0) {
                sumOddDigits += digit; // Add the odd digit to the sum
            }

            N /= 10; // Remove the last digit from the number
        }

        return sumOddDigits;
    }

    public static void main(String[] args) {
        int N = 1234567890; // Change this number to calculate the sum of odd digits for a different value

        try {
            int digitSumOdd = calculateDigitSumOdd(N);
            System.out.println("The sum of odd digits in the number " + N + " is: " + digitSumOdd);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
