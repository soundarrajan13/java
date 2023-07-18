public class CountEvenOddNumbers {

    public static void countEvenOddNumbers(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 7, 8, 15, 20 };

        countEvenOddNumbers(numbers);
    }
}
