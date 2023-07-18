public class PrimeChecker {

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

    public static void main(String[] args) {
        int number = 17; // Change this number to check different values
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
