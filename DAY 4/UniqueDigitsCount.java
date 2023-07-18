import java.util.HashSet;
import java.util.Set;

public class UniqueDigitsCount {

    public static int countUniqueDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        Set<Integer> uniqueDigits = new HashSet<>();
        
        while (number != 0) {
            int digit = number % 10;
            uniqueDigits.add(digit);
            number /= 10;
        }

        return uniqueDigits.size();
    }

    public static void main(String[] args) {
        int number = 1234567890; // Change this number to count unique digits in a different number

        try {
            int uniqueDigitsCount = countUniqueDigits(number);
            System.out.println("Number of unique digits in the number " + number + ": " + uniqueDigitsCount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
