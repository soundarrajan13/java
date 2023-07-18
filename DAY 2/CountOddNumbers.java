public class CountOddNumbers {

    public static int countOddNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 7, 8, 15, 20 };

        int oddCount = countOddNumbers(numbers);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
