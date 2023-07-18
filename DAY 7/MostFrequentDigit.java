public class MostFrequentDigit {

    public static int findMostFrequentDigit(int number) {
        String numString = String.valueOf(number);
        int[] digitCounts = new int[10];

        // Count the occurrences of each digit in the number
        for (char c : numString.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                digitCounts[digit]++;
            }
        }

        // Find the digit with the highest count
        int maxCount = 0;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digitCounts[i] > maxCount) {
                maxCount = digitCounts[i];
                mostFrequentDigit = i;
            }
        }

        return mostFrequentDigit;
    }

    public static void main(String[] args) {
        int number = 123347512; // Change this number to test different cases
        int mostFrequentDigit = findMostFrequentDigit(number);
        System.out.println("The most frequent digit in " + number + " is: " + mostFrequentDigit);
    }
}
