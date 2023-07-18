public class DigitSumEven {

    public static int calculateDigitSumEven(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int sumEvenDigits = 0;

        while (N != 0) {
            int digit = N % 10; // Extract the last digit of the number

            if (digit % 2 == 0) {
                sumEvenDigits += digit; // Add the even digit to the sum
            }

            N /= 10; // Remove the last digit from the number
        }

        return sumEvenDigits;
    }

    public static void main(String[] args) {
        int N = 1234567890; // Change this number to calculate the sum of even digits for a different value

        try {
            int digitSumEven = calculateDigitSumEven(N);
            System.out.println("The sum of even digits in the number " + N + " is: " + digitSumEven);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
