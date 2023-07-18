import java.util.Arrays;

public class DigitCount {

    public static int[] countDigits(int number) {
        int[] digitCount = new int[10]; // An array to store the count of each digit (from 0 to 9)

        while (number != 0) {
            int digit = number % 10; // Extract the last digit of the number
            digitCount[digit]++; // Increment the count for the corresponding digit
            number /= 10; // Remove the last digit from the number
        }

        return digitCount;
    }

    public static void main(String[] args) {
        int number = 1234567890; // Change this number to count digits in a different number

        int[] digitCount = countDigits(number);
        System.out.println("Occurrences of each digit in the number " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " occurs " + digitCount[i] + " times.");
        }
    }
}
