public class NonRepeatedDigitsCount {

    public static int countNonRepeatedDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int[] digitFrequency = new int[10]; // An array to store the frequency of each digit (from 0 to 9)

        while (number != 0) {
            int digit = number % 10; // Extract the last digit of the number
            digitFrequency[digit]++; // Increment the count for the corresponding digit
            number /= 10; // Remove the last digit from the number
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 1234567890; // Change this number to count non-repeated digits in a different number

        try {
            int nonRepeatedDigitsCount = countNonRepeatedDigits(number);
            System.out.println("Number of non-repeated digits in the number " + number + ": " + nonRepeatedDigitsCount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
