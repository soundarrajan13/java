public class CountPrimesInRange {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number from 2 to its square root, it's not prime
            }
        }

        return true; // If the loop completes without finding any divisor, the number is prime
    }

    public static int countPrimesInRange(int start, int end) {
        if (start < 2) {
            start = 2; // Ensure that we start counting from the first prime (2)
        }

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int start = 10; // Change this number to set the starting point of the range
        int end = 50;   // Change this number to set the ending point of the range

        int primesCount = countPrimesInRange(start, end);
        System.out.println("Number of prime numbers between " + start + " and " + end + " is: " + primesCount);
    }
}
