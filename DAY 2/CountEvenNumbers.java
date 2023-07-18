public class CountEvenNumbers {

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 7, 8, 15, 20 };

        int evenCount = countEvenNumbers(numbers);
        System.out.println("Number of even numbers: " + evenCount);
    }
}
