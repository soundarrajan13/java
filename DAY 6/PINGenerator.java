import java.util.Random;

public class PINGenerator {

    public static String generatePIN() {
        String alpha = "alpha";
        String beta = "beta";
        String gamma = "gamma";

        // Generate a random 3-digit number to add to the PIN
        Random random = new Random();
        int randomDigits = random.nextInt(900) + 100;

        // Concatenate the strings and the random digits to create the PIN
        String pin = alpha + beta + gamma + randomDigits;

        return pin;
    }

    public static void main(String[] args) {
        String pin = generatePIN();
        System.out.println("Generated PIN: " + pin);
    }
}
