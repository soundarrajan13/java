public class SecondWordInUppercase {

    public static String getSecondWordInUppercase(String input) {
        String[] words = input.split("\\s+");

        if (words.length >= 2) {
            return words[1].toUpperCase();
        } else {
            // If there are fewer than two words, return an empty string or handle the case accordingly.
            // You can also throw an exception to indicate an error.
            return "";
        }
    }

    public static void main(String[] args) {
        String input = "Hello world, how are you?"; // Change this string to test different cases
        String secondWordUppercase = getSecondWordInUppercase(input);
        System.out.println("Second word in uppercase: " + secondWordUppercase);
    }
}
