public class NthPrimeNumber {

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

    public static int findNthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input. Nth prime is defined for positive integers.");
        }

        int count = 0;
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                count++;
            }

            if (count == n) {
                return number;
            }

            number++;
        }
    }

    public static void main(String[] args) {
        int n = 6; // Change this number to get the Nth prime for a different value

        try {
            int result = findNthPrime(n);
            System.out.println("The " + n + "th prime number is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
